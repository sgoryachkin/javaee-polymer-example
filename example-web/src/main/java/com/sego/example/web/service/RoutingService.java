package com.sego.example.web.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sego.example.web.model.RoutingData;
import com.sego.example.web.model.RoutingItem;

@Path("routing")
@Produces(MediaType.APPLICATION_JSON)
public class RoutingService {
	
	@GET
	@Path("data")
	public RoutingData getData(){
		List<RoutingItem> routingItems = Arrays.asList(
				RoutingItem.of("Home", "home", "Home page"), 
				RoutingItem.of("Order", "order"));
		RoutingData routingData = RoutingData.of(routingItems);
		return routingData;
	}

}