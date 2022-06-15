package com.example.wcdnguyenmanhhung;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {

    PhoneDao dao;

    @Override
    public void init() throws ServletException {
        dao = new PhoneDao();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String brand = request.getParameter("brand");
        String description = request.getParameter("description");
        Phone phone = new Phone(name, Integer.valueOf(price),brand,description);
        dao.InsertPhone(phone);
        response.sendRedirect("home");


    }
}
