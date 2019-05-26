package model.dao;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    private static volatile DataSource dataSource;

    public static DataSource getDataSource() throws SQLException {
        if (dataSource == null){
            synchronized (ConnectionPool.class) {
                if (dataSource == null) {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                    BasicDataSource basicDataSource = new BasicDataSource();
                    basicDataSource.setUrl("jdbc:mysql://localhost:3306/hospital_db?serverTimezone=UTC");
                    basicDataSource.setUsername("root");
                    basicDataSource.setPassword("root");
                    basicDataSource.setMinIdle(5);
                    basicDataSource.setMaxIdle(10);
                    basicDataSource.setMaxOpenPreparedStatements(100);
                    dataSource = basicDataSource;
                }
            }
        }
        return dataSource;
    }
}
