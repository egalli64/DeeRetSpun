package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RED_UTENTI")
public class Users {

	@Id
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name ="RELIABILITY")
	private String reliability;
	@Column(name = "REVIEWS")
	private int reviews;
	public Users() {
		
	}
	public Users(String firstName, String lastName, String reliability, int reviews) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.reliability = reliability;
		this.reviews = reviews;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getReliability() {
		return reliability;
	}
	public void setReliability(String reliability) {
		this.reliability = reliability;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	
	
	
	
	

}
