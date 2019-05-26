package model.dao.implementation;

import java.sql.Connection;

public class JdbcDaoReferral {
    Connection connection;

    public JdbcDaoReferral(Connection connection) {
        this.connection = connection;
    }

    public JdbcDaoReferral() {
    }
}
