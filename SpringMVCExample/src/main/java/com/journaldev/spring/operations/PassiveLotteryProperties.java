package com.journaldev.spring.operations;

import java.util.Map;

public class PassiveLotteryProperties {
	protected Map<String, String> messages;

	public PassiveLotteryProperties() {
		super();
	}

	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}
}
