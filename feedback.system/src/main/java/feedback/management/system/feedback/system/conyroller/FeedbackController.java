package feedback.management.system.feedback.system.conyroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import feedback.management.system.feedback.system.entity.Feedback;
import feedback.management.system.feedback.system.services.FeedbackServices;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackServices feedbackServices;
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Restaurant Feedbacj Service";
	}
	
	
	//get the Customer Feedback list
	@GetMapping("/feedback")
	public List<Feedback> getFeedbacks(){
		
		return this.feedbackServices.getFeedbacks();
		
	}
	
	@GetMapping("/feedback/{id}")
	public Feedback getfeedback(@PathVariable String id) {
		return this.feedbackServices.getFeedback(Long.parseLong(id));
	}
	
	
	@PostMapping("/feedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		
		return this.feedbackServices.addFeedback(feedback);
	}
	
//	@PutMapping("/feedback/{id}")
//	public Feedback updateFeedback(@PathVariable Long id, @RequestBody Feedback feedback) {
//		
//		this.feedbackServices.updateFeedback(feedback);
//	}

	@PutMapping("/feedback/{id}")
	public List<Feedback> updateResponse(@PathVariable("id")long id
                                        , @RequestBody Feedback feedback){
                                        	
         return this.feedbackServices.updateResponse(feedback);
		
	}
}
