package com.sego.example.web.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MainPageData extends AbstractBaseDto {
	private static final long serialVersionUID = -8079961492236054735L;
	
	/**
	 * User name label text
	 */
	private String userName;
	
	/**
	 * Routing data for menu panel in main page
	 */
	private List<RoutingItem> routingItems;
	
	/**
	 * HashCode
	 */
	private int hash;
	
	public static MainPageData of(List<RoutingItem> items){
	    MainPageData routingData = new MainPageData();
	    routingData.setRoutingItems(items);
	    return routingData;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}



	public List<RoutingItem> getRoutingItems() {
		return routingItems;
	}



	public void setRoutingItems(List<RoutingItem> routingItems) {
		this.routingItems = routingItems;
	}

}
