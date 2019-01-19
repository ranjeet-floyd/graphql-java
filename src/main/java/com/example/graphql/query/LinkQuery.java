package com.example.graphql.query;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.example.graphql.bean.Link;
import com.example.graphql.repo.LinkRepo;

import lombok.Getter;

/**
 * Query resolver
 * 
 * @author ranjeet.kumar
 *
 */
@Getter
public class LinkQuery implements GraphQLRootResolver {

	private final LinkRepo linkRepo;

	public LinkQuery(LinkRepo linkRepo) {
		super();
		this.linkRepo = linkRepo;
	}

	/**
	 * allLinks type schema
	 * 
	 * @return
	 */
	public List<Link> allLinks() {
		return linkRepo.getAllLinks();
	}

}
