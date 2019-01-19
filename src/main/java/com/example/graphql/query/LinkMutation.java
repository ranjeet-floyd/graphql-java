package com.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.example.graphql.bean.Link;
import com.example.graphql.repo.LinkRepo;

public class LinkMutation implements GraphQLRootResolver {

	private final LinkRepo linkRepo;

	public LinkMutation(LinkRepo linkRepo) {
		super();
		this.linkRepo = linkRepo;
	}

	/**
	 * allLinks type schema
	 * 
	 * @return
	 */
	public Link createLink(String url, String description) {
		Link newLink = new Link(url, description);
		linkRepo.saveLink(newLink);
		return newLink;
	}

}
