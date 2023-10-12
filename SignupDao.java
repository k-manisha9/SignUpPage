import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SignupDao {
	static {
		System.out.println("Hello");
	}

	public static boolean create() {
		Connection con = dbconnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(
					"create table signup(phone number(10) primary key,name varchar2(10),email varchar2(30),dob date,password varchar2(10))");

			int result = ps.executeUpdate();
			 System.out.println(result);
			if (result == 0) {
				con.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean add(Member mem) {
		Connection con = dbconnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into signup values(?,?,?,?,?)");
			ps.setLong(1, mem.getPhone());
			ps.setString(2, mem.getName());
			ps.setString(3, mem.getEmail());
			ps.setString(4, mem.getDob());
			ps.setString(5, mem.getPswd());
			
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("Successfully added");
				con.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}