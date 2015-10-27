package com.sego.example.web.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sego.example.web.model.MainPageData;
import com.sego.example.web.model.RoutingItem;
import com.sego.example.web.service.util.DtoUtils;

@Path("main")
@Produces(MediaType.APPLICATION_JSON)
public class MainPageService {
	
	@GET
	@Path("data")
	public MainPageData getData() {
		List<RoutingItem> routingItems = Arrays.asList(
				RoutingItem.of("Home", "home", "Home page"), 
				RoutingItem.of("Order", "order"),
				RoutingItem.of("About", "about", "About Page "));
		MainPageData routingData = MainPageData.of(routingItems);
		routingData.setUserName("Skystar" + System.currentTimeMillis() % 1000);
		routingData.setHash(DtoUtils.hashSumm(routingData));
		return routingData;
	}

}