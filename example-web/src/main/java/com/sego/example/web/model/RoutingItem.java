package com.sego.example.web.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RoutingItem extends AbstractBaseDto {
	private static final long serialVersionUID = -4013144917432436685L;

	private String name;
	
	private String token;
	
	private String description;
	
	
	public static RoutingItem of (String name, String token) {
		RoutingItem routingItem = new RoutingItem();
		routingItem.setName(name);
		routingItem.setToken(token);
		return routingItem;
	}
	
	public static RoutingItem of (String name, String token, String description) {
		RoutingItem routingItem = RoutingItem.of(name, token);
		routingItem.setDescription(description);
		return routingItem;
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
