import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sign")
public class SignUpPage extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name=req.getParameter("uname");
		long phone=Long.parseLong(req.getParameter("phone"));
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		String pass=req.getParameter("pswd");
		
		res.sendRedirect("main?uname="+name+"&phone="+phone+"&email="+email+"&dob="+dob+"&pswd="+pass);
	}

}
