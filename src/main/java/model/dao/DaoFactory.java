package model.dao;

import model.dao.implementation.*;

import java.sql.SQLException;

public abstract class DaoFactory {
    //    private static Optional<DaoFactory> daoFactory;
    private static DaoFactory daoFactory;

    public abstract JdbcDaoPersonalRegData getDaoUserData();

    public abstract JdbcDaoPatientVisit getDaoPatientVisit();

    public abstract JdbcDaoReferral getDaoReferral();

    public abstract JdbcDaoExamResultByReferral getDaoExamResultByReferral();

    public abstract JdbcDaoMedicalCard getDaoMedicalCard();

//    public static Optional<DaoFactory> getInstance() {
//        if (!daoFactory.isPresent()) {
//            synchronized (DaoFactory.class) {
//                if (!daoFactory.isPresent()) {
//                    DaoFactory tempDaoFactory = new JdbcDaoFactory();
//                    daoFactory = Optional.of(tempDaoFactory);
//                }
//            }
//        }
//        return daoFactory;
//    }

    public static DaoFactory getInstance() throws SQLException {
        if (daoFactory == null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    DaoFactory tempDaoFactory = new JdbcDaoFactory();
                    daoFactory = tempDaoFactory;
                }
            }
        }
        return daoFactory;
    }
}
