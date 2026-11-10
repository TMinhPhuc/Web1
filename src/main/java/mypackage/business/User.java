package mypackage.business;
import java.io.Serializable;

public class User implements Serializable {
	private String email;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	
	public User() {
		this.email = "";
		this.firstName = "";
		this.lastName = "";
		this.dateOfBirth = "";
	}
	
	public User(String email, String firstName, String lastName, String dateOfBirth) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
}
