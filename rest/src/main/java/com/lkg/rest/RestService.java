package com.lkg.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/service")
public class RestService {

	// Call this using http://localhost:8080/rest/service
	@GET
	public Response get() {

		return Response.status(200).entity("Default service is called").build();

	}

	// http://localhost:8080/rest/service/test
	@GET
	@Path("/test")
	public Response getTest() {

		return Response.status(200).entity("Test service is called").build();

	}

	// http://localhost:8080/rest/service/user/Tom
	@GET
	@Path("/user/{name}")
	public Response getHelloNameService(@PathParam("name") String name) {

		return Response.status(200).entity("Hello " + name + " using Path Param").build();

	}

	// http://localhost:8080/rest/service/user?name=Tom
	@GET
	@Path("/user")
	public Response getHelloNameServiceQueryParam(@QueryParam("name") String name) {

		return Response.status(200).entity("Hello " + name + " using Query Param").build();

	}

}