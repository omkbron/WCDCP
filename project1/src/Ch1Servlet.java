import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class Ch1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        Date today = new Date();
        StringBuilder builder = new StringBuilder("<html>");
        builder.append("<body>").append("<h1 align=center>HF's Chapter1 Servlet</h1>");
        builder.append("<br>").append(today).append("</body></html>");
        out.println(builder.toString());
    }
}
