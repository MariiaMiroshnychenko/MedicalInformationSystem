package model.dao.implementation;

import model.dao.ConnectionPool;
import model.dao.DaoFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class JdbcDaoFactory extends DaoFactory {
    private DataSource dataSource = ConnectionPool.getDataSource();

    public JdbcDaoFactory() throws SQLException {
    }

    @Override
    public JdbcDaoUserData getDaoUserData() {
        return new JdbcDaoUserData(getConnection());
    }

    @Override
    public JdbcDaoPatientVisit getDaoPatientVisit() {
        return new JdbcDaoPatientVisit(getConnection());
    }

    @Override
    public JdbcDaoReferral getDaoReferral() {
        return new JdbcDaoReferral(getConnection());
    }

    @Override
    public JdbcDaoExamResultByReferral getDaoExamResultByReferral() {
        return new JdbcDaoExamResultByReferral(getConnection());
    }

    @Override
    public JdbcDaoMedicalCard getDaoMedicalCard() {
        return new JdbcDaoMedicalCard(getConnection());
    }

    private Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
