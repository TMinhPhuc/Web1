package mypackage;
import java.io.Serializable;

public class User implements Serializable{
	private String firstName;
	private String lastName;
	private String email;
	
	public User() {
		this.email = "";
		this.firstName = "";
		this.lastName = "";
	}
	
	public User(String firstName, String lastName, String email) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFistName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLasttName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
}
