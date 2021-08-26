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
    List<Product> ourProducts = new ArrayList<>(Arrays.asList(
            new Product(1, "Mazda", 1_200_000f),
            new Product(2, "TelNet", 98_000f),
            new Product(3, "Ibanez", 177_000f),
            new Product(4, "Learning OS", 2_300f),
            new Product(5, "Fresh", 30_000f),
            new Product(6, "Acer", 86_000f),
            new Product(7, "Toshiba", 113_000f),
            new Product(8, "Freeze", 1_200_000f),
            new Product(9, "Hyundai HB4000", 1_200_000f),
            new Product(10, "Big", 40_000_000f)
    ));

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
