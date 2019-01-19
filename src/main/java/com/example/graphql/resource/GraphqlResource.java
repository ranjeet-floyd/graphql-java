package com.example.graphql.resource;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;
import com.example.graphql.query.Query;
import com.example.graphql.repo.LinkRepo;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

/**
 * Simple Graphql end point resource based on resource file "schema"
 * 
 * @author ranjeet.kumar
 *
 */
@WebServlet(urlPatterns = "/graphql")
public class GraphqlResource extends SimpleGraphQLServlet {

	private static final long serialVersionUID = 4223838476085086851L;
	private static final String SCHEMA_GRAPHQL_FILE = "schema.graphqls";

	public GraphqlResource() {
		super(buildQuerySchema());
	}

	private static GraphQLSchema buildQuerySchema() {
		final LinkRepo linkRepo = new LinkRepo();
		return SchemaParser.newParser().file(SCHEMA_GRAPHQL_FILE).resolvers(new Query(linkRepo)).build()
				.makeExecutableSchema();

	}

}
