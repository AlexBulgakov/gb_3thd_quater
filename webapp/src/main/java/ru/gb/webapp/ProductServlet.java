package ru.gb.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "productServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        int j = 1;
        int id = 1;

        for (int i = 0; i < 10; i++) {

            Product p = new Product(id++, "Product " + j++, (int) (Math.random() * 20) + 50);

            out.println("<h1>" + "<span>" + p.getId() + ") </span>" + "<span>" + p.getTitle() + ": </span>" + p.getCoast() + "$ </h1>");
        }

        out.println("</body></html>");
    }

    @Override
    public void destroy() {

    }
}
