package com.kingshuk.restwebservices.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employee")
public class EmployeeResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/")
	public String welcomeMessage() {
		return "Welcome to the employee resource class";
	}

}
