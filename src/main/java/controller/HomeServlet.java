package controller;

import dao.PhoneDao;
import model.PhoneEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    PhoneDao dao = new PhoneDao();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhoneEntity> phone = getAllPhone();
        request.setAttribute("phone", phone);
        request.getRequestDispatcher("phone.jsp").forward(request, response);
    }

    private List<PhoneEntity> getAllPhone() {
        List<PhoneEntity> phone = dao.getAll();
        for (PhoneEntity p : phone) {
        }
        return phone;
    }


    private void insertProduct() {
        PhoneEntity p = new PhoneEntity();
        dao.insertPhone(p);
    }
}
