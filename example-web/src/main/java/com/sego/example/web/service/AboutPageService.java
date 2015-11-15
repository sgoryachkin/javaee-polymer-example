package com.sego.example.web.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sego.example.web.model.about.AboutPageData;

@Path("about")
@Produces(MediaType.APPLICATION_JSON)
public class AboutPageService {
	
	private static AboutPageData aboutPageData = AboutPageData.of("1.0", "text text");
	
	@GET
	@Path("data")
	public AboutPageData getData() {
		return aboutPageData;
	}

}