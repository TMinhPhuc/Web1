package mypackage.business;

public class Survey {
	private User user;
	private String hearFrom;
	private boolean likeReceiveAnnoucement;
	private boolean sendAnnouncement;
	private String contactMethod;
	
	public Survey(User user, String hearFrom, boolean likeReceiveAnnoucement, boolean sendAnnouncement, String contactMethod) {
		this.user = user;
		this.likeReceiveAnnoucement = likeReceiveAnnoucement;
		this.sendAnnouncement = sendAnnouncement;
		this.contactMethod = contactMethod;
		this.hearFrom = hearFrom;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return this.user;
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
	
	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}
	
	public String getContactMethod() {
		return this.contactMethod;
	}
	
	public void setHearFrom(String hearFrom) {
		this.hearFrom = hearFrom;
	}
	
	public String getHearFrom() {
		return this.hearFrom;
	}
}
