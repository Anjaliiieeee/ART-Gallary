package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Artstyle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int styleId;
	private String styleName;
	

	public int getStyleId() {
		return styleId;
	}

	public void setStyleId(int styleId) {
		this.styleId = styleId;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public Artstyle() {
		super();
	}
    Artstyle(int styleId, String styleName) {
		super();
		this.styleId = styleId;
		this.styleName = styleName;
	}

	@Override
	public String toString() {
		return "Artstyle [styleId=" + styleId + ", styleName=" + styleName + "]";
	}
	

}
	


