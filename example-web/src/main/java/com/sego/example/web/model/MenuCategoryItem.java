package com.sego.example.web.model;

import java.util.List;

public class MenuCategoryItem extends AbstractBaseDto {
	private static final long serialVersionUID = 2498770737542252880L;

	private String name;
	
	private List<MenuItem> menuItems;
	
	public static MenuCategoryItem of(String name, List<MenuItem> menuItems){
		MenuCategoryItem menuCategoryItem = new MenuCategoryItem();
		menuCategoryItem.setName(name);
		menuCategoryItem.setMenuItems(menuItems);
		return menuCategoryItem;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

}
