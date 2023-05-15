package feedback.management.system.feedback.system.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.AnyDiscriminator;

import jakarta.persistence.DiscriminatorValue;

public class Feedback {
	private Long id;
	private String name;
	private String email;
	private int rating;
	private String comments;
	private Timestamp created_at;
	private Timestamp updated_at;
	private String response;
	
	
	
	public Feedback(int id, String name, String email, int rating, String comments, Timestamp created_at,
			Timestamp updated_at, String response) {
		super();
		this.id = (long) id;
		this.name = name;
		this.email = email;
		this.rating = rating;
		this.comments = comments;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.response = response;
		
	}


	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}


	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", email=" + email + ", rating=" + rating + ", comments="
				+ comments + ", created_at=" + created_at + ", updated_at=" + updated_at + ", response=" + response
				+ "]";
	}

	


	
	
	
}
