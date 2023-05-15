package feedback.management.system.feedback.system.services;

import java.util.List;

import feedback.management.system.feedback.system.entity.Feedback;

public interface FeedbackServices {
	
	public List<Feedback> getFeedbacks();
	
    public Feedback getFeedback(long id);
    
    public Feedback addFeedback(Feedback feedback);

	public List<Feedback> updateResponse(Feedback feedback);
    
  
}
