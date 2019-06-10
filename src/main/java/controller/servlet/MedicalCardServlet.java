package controller.servlet;

import model.dao.implementation.JdbcDaoFactory;
import model.entity.MedicalCard;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicalCardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF8");

        List<MedicalCard> medicalCards = null;
//        List<MedicalCard> medicalCards = (List<MedicalCard>) JdbcDaoFactory.getInstance().get().getDaoMedicalCard();
        try {
            medicalCards =  JdbcDaoFactory.getInstance().getDaoMedicalCard().getAllMedicalCard();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.setAttribute("medcards", medicalCards);

        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF8");
    }


}
