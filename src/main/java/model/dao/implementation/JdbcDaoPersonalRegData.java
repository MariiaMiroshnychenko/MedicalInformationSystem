package model.dao.implementation;

import model.dao.PersonalRegDataDao;
import model.entity.PersonalRegData;
import model.dao.mapper.implementation.PersonalRegDataMapper;
import model.queries.QueriesConstant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JdbcDaoPersonalRegData implements PersonalRegDataDao{
    private Connection connection;

    private PersonalRegDataMapper personalRegDataMapper = new PersonalRegDataMapper();
    private Map<Integer, PersonalRegData> users = new HashMap<>();

    JdbcDaoPersonalRegData(Connection connection) {
        this.connection = connection;
    }

    public JdbcDaoPersonalRegData() {
    }

    @Override
    public PersonalRegData findByLoginAndPassword(String login, String password) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesConstant.FIND_USER_BY_LOGIN_AND_PASSWORD)) {
            statement.setString(1, login);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            PersonalRegData user = null;

            if (resultSet.next()) {
                user = personalRegDataMapper.extractFromResultSet(resultSet);
            }
            if (Objects.nonNull(user)) {
                personalRegDataMapper.makeUnique(users, user);

            }
            resultSet.close();
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int roleUserByCode (String code) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesConstant.GET_ROLE_FOR_USER)) {
            statement.setString(1, code);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.getInt("role_id");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void create(PersonalRegData entity, String code) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesConstant.REGISTER_USER)) {
            statement.setString(1, entity.getSurname());
            statement.setString(2, entity.getName());
            statement.setString(3, entity.getPatronymic());

            statement.setDate(4, entity.getBirthDate());
            statement.setString(5, entity.getPassSeries());
            statement.setString(6, entity.getPassNumber());
            statement.setString(7, entity.getIdentCode());

            statement.setString(8, entity.getPhone());
            statement.setString(9, entity.getEmail());
            statement.setString(10, entity.getLogin());
            statement.setString(11, entity.getPassword());

            statement.setInt(12, roleUserByCode(code));

            statement.setBoolean(13, true);
            statement.setString(14, entity.getPhoto());

            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PersonalRegData findById(int id) {
        return null;
    }

    @Override
    public List<PersonalRegData> findAll() {
        return null;
    }

    @Override
    public void update(PersonalRegData entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() {

    }
}
