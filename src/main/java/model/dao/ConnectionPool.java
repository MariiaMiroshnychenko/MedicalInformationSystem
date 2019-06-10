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
                    BasicDataSource basicDataSource = new BasicDataSource();
                    basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
                    basicDataSource.setUrl("jdbc:mysql://localhost:3306/medicine?useSSL=false&serverTimezone=UTC");
                    basicDataSource.setUsername("root");
                    basicDataSource.setPassword("root");
                    basicDataSource.setMaxOpenPreparedStatements(100);
                    dataSource = basicDataSource;
                }
            }
        }
        return dataSource;
    }
}
