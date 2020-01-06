package com.journaldev.spring.domain;


import java.util.Map;

public class SpringProperties {
	protected Map<String, String> messages;

	public SpringProperties() {
		super();
	}

	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}
}