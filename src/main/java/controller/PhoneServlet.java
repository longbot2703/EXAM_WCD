package controller;

import dao.PhoneDao;
import model.PhoneEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PhoneServlet", urlPatterns = {"/phone"})
public class PhoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PhoneDao dao = new PhoneDao();
        int id = Integer.parseInt(request.getParameter("id"));
        PhoneEntity phone = dao.findProduct(id);
    }
}
