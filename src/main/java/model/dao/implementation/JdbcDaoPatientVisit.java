package model.dao.implementation;

import java.sql.Connection;

public class JdbcDaoPatientVisit {
    Connection connection;

    public JdbcDaoPatientVisit(Connection connection) {
        this.connection = connection;
    }

    public JdbcDaoPatientVisit() {
    }
}
