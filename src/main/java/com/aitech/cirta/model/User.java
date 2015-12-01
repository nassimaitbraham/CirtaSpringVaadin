package com.aitech.cirta.model;

import org.springframework.stereotype.Component;

/**
 * 
 * Model d'un user
 * 
 * @author Nassim AIT BRAHAM AITECH COMPANY
 *
 */

@Component
public class User {
	
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
