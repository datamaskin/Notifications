package com.boundary.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/user")
public class JSONService {

	@GET
	/*@Path("/get")*/
	@Path("/by_user")
	@Produces("application/json")
	public User getUserInJSON() {

		User user = new User();
		user.setMessage("Notification");
		user.setTimestamp((int) System.currentTimeMillis());
		user.setUser_id(0);
		
		return user;

	}

	@POST
	@Path("/notifications")
	@Consumes("application/json")
	public Response createUserInJSON(User user) {

		String result = "User created : " + user;
		return Response.status(201).entity(result).build();
		
	}
	
}