package com.foodDeliverySystem.designPatterns;

import com.foodDeliverySystem.designPatterns.observer.*;
import com.foodDeliverySystem.designPatterns.subject.*;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		//create subject, it is the deliveryTracker here
		DeliveryTracker deliveryTracker = new DeliveryTracker();
		
		//create observers
		Observer clientA = new ClientOrder("Client A");
		Observer clientB = new ClientOrder("Client B");
		
		//register client to the deliveryTracker
		deliveryTracker.register(clientA);
		deliveryTracker.register(clientB);
		
		//attach deliveryTracker to clientOrders
		clientA.setSubject(deliveryTracker);
		clientB.setSubject(deliveryTracker);

		
		//check if any update is available
		clientA.update();
		
		//post delivery message to clients 
		deliveryTracker.postMessage("Delivery boy is on the way..");
		
		Observer clientC = new ClientOrder("Client C");
		deliveryTracker.register(clientC);
		clientC.setSubject(deliveryTracker);
		
		//post delivery message to clients 
		deliveryTracker.postMessage("Food will be delivered by our agent in 2 mins..");
		
	}
}
