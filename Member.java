
public class Member {
	private long phone;
	private String name,email,pswd,dob;
	public Member() {
		super();
	}
	public Member(long phone, String name, String email, String pswd, String dob) {
		super();
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.pswd = pswd;
		this.dob = dob;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	

}
