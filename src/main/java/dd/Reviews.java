package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEWS")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="ReviewGen")
	@SequenceGenerator(sequenceName="REVIEWS_SEQ",
	allocationSize=1, name="ReviewsGen")
	
	@Column(name = "REVIEW_ID")
	private int reviewId;
	@Column(name = "RESTAURANT_ID")
	private int restaurantId;
	@Column(name = "USER_ID")
	private int userId;
	@Column(name ="REVIEW")
	private String review;
	@Column(name ="VOTE")
	private int vote;
	@Column(name = "LIKES")
	private int miPiace;
	@Column(name = "UNLIKES")
	private int nonMiPiace;
	
	
	public Reviews() {
		
	}
	
	public Reviews(int restaurantId, int userId, String review, int vote) {
		this.restaurantId = restaurantId;
		this.userId = userId;
		this.review = review;
		this.vote = vote;
	}
	
	public Reviews(int reviewId, int restaurantId, int userId, String review, int vote, int miPiace, int nonMiPiace) {
		this.reviewId = reviewId;
		this.restaurantId = restaurantId;
		this.userId = userId;
		this.review = review;
		this.vote = vote;
		this.miPiace = miPiace;
		this.nonMiPiace = nonMiPiace;
	}
	
	
	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getMiPiace() {
		return miPiace;
	}
	public void setMiPiace(int miPiace) {
		this.miPiace = miPiace;
	}
	public int getNonMiPiace() {
		return nonMiPiace;
	}
	public void setNonMiPiace(int nonMiPiace) {
		this.nonMiPiace = nonMiPiace;
	}

	@Override
	public String toString() {
		return "Reviews [reviewId=" + reviewId + ", restaurantId=" + restaurantId + ", userId=" + userId + ", review="
				+ review + ", vote=" + vote + ", miPiace=" + miPiace + ", nonMiPiace=" + nonMiPiace + "]";
	}

	
	
	
	

}
