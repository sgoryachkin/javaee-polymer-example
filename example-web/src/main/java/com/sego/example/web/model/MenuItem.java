package com.sego.example.web.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MenuItem extends AbstractBaseDto {
	private static final long serialVersionUID = -4013144917432436685L;

	private String name;
	
	private String token;
	
	private String description;
	
	
	public static MenuItem of (String name, String token) {
		MenuItem menuItem = new MenuItem();
		menuItem.setName(name);
		menuItem.setToken(token);
		return menuItem;
	}
	
	public static MenuItem of (String name, String token, String description) {
		MenuItem menuItem = MenuItem.of(name, token);
		menuItem.setDescription(description);
		return menuItem;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
