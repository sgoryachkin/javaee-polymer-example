package com.sego.example.web.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RoutingData extends AbstractBaseDto {
	private static final long serialVersionUID = -8079961492236054735L;
	
	private List<RoutingItem> items;
	
	public static RoutingData of(List<RoutingItem> items){
	    RoutingData routingData = new RoutingData();
	    routingData.setItems(items);
	    return routingData;
	}

	public List<RoutingItem> getItems() {
		return items;
	}

	public void setItems(List<RoutingItem> items) {
		this.items = items;
	}

}
