package model.dao.implementation;

import java.sql.Connection;

public class JdbcDaoExamResultByReferral {
    Connection connection;

    public JdbcDaoExamResultByReferral(Connection connection) {
        this.connection = connection;
    }

    public JdbcDaoExamResultByReferral() {
    }
}
