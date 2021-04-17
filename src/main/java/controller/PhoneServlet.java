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

    PhoneDao dao = new PhoneDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PhoneEntity p = new PhoneEntity();
        p.setName(request.getParameter("name"));
        p.setBrand(request.getParameter("brand"));
        p.setDescription(request.getParameter("description"));

        dao.insertPhone(p);
        doGet(request,response);
    }
}
