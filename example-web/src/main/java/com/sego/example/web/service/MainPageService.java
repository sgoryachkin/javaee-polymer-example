package com.sego.example.web.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sego.example.web.model.MainPageData;
import com.sego.example.web.model.MenuCategoryItem;
import com.sego.example.web.model.MenuItem;
import com.sego.example.web.service.util.DtoUtils;

@Path("main")
@Produces(MediaType.APPLICATION_JSON)
public class MainPageService {
	
	private static List<MenuItem> firstItems = Arrays.asList(
			MenuItem.of("Home", "home", "Home page"), 
			MenuItem.of("Order", "order"));
	private static List<MenuItem> secondItems = Arrays.asList(
			MenuItem.of("About", "about", "About Page "));
	private static List<MenuCategoryItem> categoryItems = Arrays.asList(
			MenuCategoryItem.of("Category1", firstItems),
			MenuCategoryItem.of("Category2", secondItems));
	
	@GET
	@Path("data")
	public MainPageData getData() {
		MainPageData routingData = MainPageData.of(categoryItems);
		routingData.setUserName("Skystar" + System.currentTimeMillis() % 1000);
		routingData.setHash(DtoUtils.hashSumm(routingData));
		return routingData;
	}

}