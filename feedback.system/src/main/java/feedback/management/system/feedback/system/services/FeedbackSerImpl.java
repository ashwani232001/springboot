package feedback.management.system.feedback.system.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import feedback.management.system.feedback.system.entity.Feedback;

@Service
public class FeedbackSerImpl implements FeedbackServices {
	
	List<Feedback> list;
	
	public FeedbackSerImpl() {
		
		list = new ArrayList<>();
		list.add(new Feedback(1,"ashwani","ashwani@123",4, "nice", null, null, null));
		list.add(new Feedback(2,"ankit","ankit@123",4, "fantastic", null, null, null));
		
	}
	
	
	@Override
	public List<Feedback> getFeedbacks() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Feedback getFeedback(long id) {
		Feedback c= null;
		for(Feedback feedback:list)
		{
			if(feedback.getId()==id) 
			{
				c=feedback;
				break;
			}
		}
		return c;
	}

public Feedback addFeedback(Feedback feedback) {
		list.add(feedback);
		return feedback;
	}


@Override
public List<Feedback> updateResponse(Feedback feedback) {
	
	
	return list;
}

}
