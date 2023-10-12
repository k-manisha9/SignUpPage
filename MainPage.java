import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/main")
public class MainPage extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name=req.getParameter("uname");
		long phone=Long.parseLong(req.getParameter("phone"));
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		String pass=req.getParameter("pswd");
		
		Member mem=new Member(phone,name,email,pass,dob);
		SignupDao dao=new SignupDao();
		dao.add(mem);
		
		PrintWriter out=res.getWriter();
		out.println("Welcome "+name+" !!! ");
		out.println("Your data has been successfully inserted...");

		out.println("Your Records in the database are: ");
		out.println("Phone no\t\tName\t\tEmail\t\t\t\tPassword\t\tDOB");
		out.println(phone+"\t\t"+name+"\t\t"+email+"\t\t"+pass+"\t\t\t"+dob);

	}

}
