package com.example.graphql.bean;

import lombok.Data;

/**
 * Data class for schema definition
 * 
 * @author ranjeet.kumar
 *
 */
@Data
public class Link {

	private final String url;
	private final String description;

	public Link(String url, String description) {
		super();
		this.url = url;
		this.description = description;
	}

}
