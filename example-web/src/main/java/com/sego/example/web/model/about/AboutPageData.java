package com.sego.example.web.model.about;

import com.sego.example.web.model.AbstractBaseDto;

public class AboutPageData extends AbstractBaseDto {
	private static final long serialVersionUID = 7576724821020287510L;
	
	private String version;
	
	private String text;
	
	public static AboutPageData of(String version, String text){
		AboutPageData aboutPageData = new AboutPageData();
		aboutPageData.setText(text);
		aboutPageData.setVersion(version);
		return aboutPageData;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
