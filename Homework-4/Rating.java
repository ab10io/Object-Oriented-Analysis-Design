package abhinav;

import java.io.ObjectInputStream.GetField;

public class Rating {
	
	private int ratingID;
	private String review;
	private int rating;
	
	// Getters and Setters.
	public int getRatingID() {
		return ratingID;
	}
	public void setRatingID(int ratingID) {
		this.ratingID = ratingID;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	// Insert the rating and the reviews to the DB
	public void insertCommentToDB() {
		System.out.println("Comment Posted");
	}

	// Retrieve all the review and ratings.
	public void viewAllRatingsAndReviews() {
		System.out.println("Here are all your comments and ratings");
	}
	
	

}
