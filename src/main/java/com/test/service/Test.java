package com.test.service;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class Test implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		 MuleMessage msg = eventContext.getMessage();
		 msg.setInvocationProperty("name", "rajhans");
		
		return msg;
	}

}
