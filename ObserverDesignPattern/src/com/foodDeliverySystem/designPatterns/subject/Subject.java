package com.foodDeliverySystem.designPatterns.subject;

import com.foodDeliverySystem.designPatterns.observer.*;

public interface Subject {
	
	//Register the observer
	public void register(Observer obj);
	
	// Unregister the observer
	public void unregister(Observer obj);
		
	//Notify Observer whenever there is an update
	public void notifyObservers();
		
	//get the update to the observer
	public Object getUpdate(Observer obj);

}
