package level4.lesson9;

import com.sun.net.httpserver.HttpServer;
import level4.lesson8.model.City;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/hello")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("default.jsp").forward(request, response);
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        List<City> cities = new ArrayList<>();
//        cities.add(new City(1, "Brest"));
//        cities.add(new City(2, "Vitebsk"));
//        cities.add(new City(3, "Gomel"));
//        cities.add(new City(4, "Grodno"));
//        cities.add(new City(5, "Minsk"));
//        cities.add(new City(6, "Mogilev"));
//
//        out.println(cities);
//
//        out.println("<table>");
//            out.println("<tr>");
//                out.println("<td>");
//                out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//            out.println("</tr>");
//            out.println("<tr>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//            out.println("</tr>");
//            out.println("<tr>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//                out.println("<td>");
//        out.println("1");
//                out.println("</td>");
//            out.println("</tr>");
//        out.println("</table>");
//
    }



}
