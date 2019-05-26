package model.dao.implementation;

import java.sql.Connection;

public class JdbcDaoUserData {
    Connection connection;

    public JdbcDaoUserData(Connection connection) {
        this.connection = connection;
    }

    public JdbcDaoUserData() {
    }
}
