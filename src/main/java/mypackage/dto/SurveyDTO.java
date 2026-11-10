package mypackage.dto;

public class SurveyDTO {
	private String email;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String hearFrom;
	private boolean likeReceiveAnnoucement;
	private boolean sendAnnouncement;
	private String contactMethod;
	
	public SurveyDTO() {
		
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
	
	public void setHearFrom(String hearFrom) {
		this.hearFrom = hearFrom;
	}
	
	public String getHearFrom() {
		return this.hearFrom;
	}
	
	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}
	
	public String getContactMethod() {
		return this.contactMethod;
	}
	
	public void setLikeReceiveAnnoucement(boolean likeReceiveAnnoucement) {
		this.likeReceiveAnnoucement = likeReceiveAnnoucement;
	}
	
	public boolean getLikeReceiveAnnoucement() {
		return this.likeReceiveAnnoucement;
	}
	
	public void setSendAnnouncement(boolean sendAnnouncement) {
		this.sendAnnouncement = sendAnnouncement;
	}
	
	public boolean getSendAnnouncement() {
		return this.sendAnnouncement;
	}
	
}
