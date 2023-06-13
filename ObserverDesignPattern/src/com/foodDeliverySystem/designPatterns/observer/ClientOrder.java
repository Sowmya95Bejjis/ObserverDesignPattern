package com.foodDeliverySystem.designPatterns.observer;

import com.foodDeliverySystem.designPatterns.subject.*;

public class ClientOrder implements Observer {
	
	private String name;
	private Subject topic;
	
	public ClientOrder(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}

}
