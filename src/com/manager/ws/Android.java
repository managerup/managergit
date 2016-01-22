package com.manager.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/android")
public class Android {

	@GET
	@Produces("application/xml")
	public String login(){
		return "login succesful";
	}
	
}
