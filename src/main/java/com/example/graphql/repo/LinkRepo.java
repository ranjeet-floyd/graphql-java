package com.example.graphql.repo;

import java.util.ArrayList;
import java.util.List;

import com.example.graphql.bean.Link;

/**
 * DOA for link.
 * 
 * @author ranjeet.kumar
 *
 */
public class LinkRepo {

	private List<Link> links;

	public LinkRepo() {
		links = new ArrayList<Link>();
		links.add(new Link("http://google.com", "google"));
		links.add(new Link("http://facebook.com", "facebook"));
	}

	public List<Link> getAllLinks() {
		return links;
	}

	public void saveLink(Link link) {
		links.add(link);
	}

}
