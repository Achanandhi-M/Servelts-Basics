import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
res.setContentType("text/plain");
res.getWriter().write("Hello World");
}
}

