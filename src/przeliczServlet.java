import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/policz")
public class przeliczServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String kilogramy = req.getParameter("kilogramy");
        String gramy = req.getParameter("gramy");
        String miligramy = req.getParameter("miligramy");
        PrintWriter writer = resp.getWriter();
        try {
            if (!kilogramy.isEmpty() && gramy.isEmpty() && miligramy.isEmpty()) {
                Double kg = Double.parseDouble(kilogramy);
                gramy = String.valueOf(kg * 1000);
                miligramy = String.valueOf(kg * 1000000);
                writer.println("<h1>" + "podana wartosc w przeliczeniu na" + "</h1>" + "<br>" + "<br>");
                writer.println("kilogramy : " + kilogramy + "<br>");
                writer.println("gramy : " + gramy + "<br>");
                writer.println("miligramy : " + miligramy + "<br>");
            } else if (kilogramy.isEmpty() && !gramy.isEmpty() && miligramy.isEmpty()) {
                Double g = Double.parseDouble(gramy);
                kilogramy = String.valueOf(g / 1000);
                miligramy = String.valueOf(g * 1000);
                writer.println("<h1>" + "podana wartosc w przeliczeniu na" + "</h1>" + "<br>" + "<br>");
                writer.println("kilogramy : " + kilogramy + "<br>");
                writer.println("gramy : " + gramy + "<br>");
                writer.println("miligramy : " + miligramy + "<br>");
            } else if (kilogramy.isEmpty() && gramy.isEmpty() && !miligramy.isEmpty()) {
                Double mg = Double.parseDouble(miligramy);
                gramy = String.valueOf(mg / 1000);
                kilogramy = String.valueOf(mg / 1000000);
                writer.println("<h1>" + "podana wartosc w przeliczeniu na" + "</h1>" + "<br>" + "<br>");
                writer.println("kilogramy : " + kilogramy + "<br>");
                writer.println("gramy : " + gramy + "<br>");
                writer.println("miligramy : " + miligramy + "<br>");
            } else {
                writer.println("<h1>" + "wypelnij tylko jedno pole " + "</h1>");
            }

        } catch (
                NumberFormatException e)

        {
            writer.println("<h1>" + "podales niedozwolony znak" + "</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {


    }
}
