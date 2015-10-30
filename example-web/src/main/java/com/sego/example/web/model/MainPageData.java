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
	private List<MenuCategoryItem> menuCategoryItems;
	
	/**
	 * HashCode
	 */
	private int hash;
	
	public static MainPageData of(List<MenuCategoryItem> menuCategoryItems){
	    MainPageData routingData = new MainPageData();
	    routingData.setMenuCategoryItems(menuCategoryItems);
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

	public List<MenuCategoryItem> getMenuCategoryItems() {
		return menuCategoryItems;
	}

	public void setMenuCategoryItems(List<MenuCategoryItem> menuCategoryItems) {
		this.menuCategoryItems = menuCategoryItems;
	}


}
