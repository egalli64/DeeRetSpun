package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RED_UTENTI")
public class Utenti {

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
	public Utenti() {
		
	}
	public Utenti(int userId, String firstName, String lastName, String reliability, int reviews) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.reliability = reliability;
		this.reviews = reviews;
	}
	
	
	
	
	

}
