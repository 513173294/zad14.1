import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/policzOdleglosc")
public class policzServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");
try {


    if (!metry.isEmpty() && centymetry.isEmpty() && milimetry.isEmpty()) {
        Double m = Double.parseDouble(metry);
        centymetry = String.valueOf(m * 100);
        milimetry = String.valueOf(m * 10000);
        writer.println("<h1>" + "podana wartosc w przeliczeniu na" + "</h1>" + "<br>" + "<br>");
        writer.println("metry : " + metry + "<br>");
        writer.println("centymetry : " + centymetry + "<br>");
        writer.println("milimetry : " + milimetry + "<br>");
    } else if (metry.isEmpty() && !centymetry.isEmpty() && milimetry.isEmpty()) {
        Double cm = Double.parseDouble(centymetry);
        metry = String.valueOf(cm / 100);
        milimetry = String.valueOf(cm * 10);
        writer.println("<h1>" + "podana wartosc w przeliczeniu na" + "</h1>" + "<br>" + "<br>");
        writer.println("metry : " + metry + "<br>");
        writer.println("centymetry : " + centymetry + "<br>");
        writer.println("milimetry : " + milimetry + "<br>");
    } else if (metry.isEmpty() && centymetry.isEmpty() && !milimetry.isEmpty()) {
        Double mm = Double.parseDouble(milimetry);
        metry = String.valueOf(mm / 10000);
        centymetry = String.valueOf(mm / 10);
        writer.println("<h1>" + "podana wartosc w przeliczeniu na" + "</h1>" + "<br>" + "<br>");
        writer.println("metry : " + metry + "<br>");
        writer.println("centymetry : " + centymetry + "<br>");
        writer.println("milimetry : " + milimetry + "<br>");
    } else {
        writer.println("<h1>" + "wypelnij tylko jedno pole " + "</h1>");
    }

}catch (NumberFormatException e){
    writer.println("<h1>"+ "podales niedozwolony znak"+"</h1>");
}



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {


    }


}
