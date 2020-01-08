package com.journaldev.spring.auxiliares;

public class LinkMenu {
	
	private String name;
	private String link;

	public LinkMenu(String link, String name) {
		super();
		this.name = name;
		this.link = link;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
