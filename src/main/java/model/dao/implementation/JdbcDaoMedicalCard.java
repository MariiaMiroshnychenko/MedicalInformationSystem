package model.dao.implementation;

import model.dao.DaoMedicalCard;
import model.entity.MedicalCard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcDaoMedicalCard implements DaoMedicalCard{
    Connection connection;

    public JdbcDaoMedicalCard(Connection connection) {
        this.connection = connection;
    }

    public JdbcDaoMedicalCard() {
    }

    @Override
    public List<MedicalCard> getAllMedicalCard() {
        List<MedicalCard> medicalCards = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM medical_card")) {
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                MedicalCard medicalCard = new MedicalCard();

                medicalCard.setPatientId(results.getInt(2));
                medicalCard.setVisitId(results.getInt(3));

                medicalCard.setRefResultId(results.getInt(4));

                medicalCards.add(medicalCard);
            }

            } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicalCards;
    }
}
