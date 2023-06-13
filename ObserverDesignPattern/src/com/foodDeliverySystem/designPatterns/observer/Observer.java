package com.foodDeliverySystem.designPatterns.observer;

import com.foodDeliverySystem.designPatterns.subject.*;

public interface Observer {
	
	public void update();
		
	public void setSubject(Subject sub);

}
