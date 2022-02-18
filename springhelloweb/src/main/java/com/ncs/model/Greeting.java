package com.ncs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {

	private String greet;
	private String name;
	
	public String getGreet() {
		return greet;
	}
	public void setGreet(String greet) {
		this.greet = greet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Greeting() {
	}

	public Greeting(String greet, String name) {
		super();
		this.greet = greet;
		this.name = name;
	}

}

