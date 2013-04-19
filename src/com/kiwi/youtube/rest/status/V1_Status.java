package com.kiwi.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/")
public class V1_Status {

	/* Annotation tells Jeresy what to look for and how to handle requests
	 *
	 */
	@GET
	@Produces(MediaType.TEXT_HTML) // How is going to be encoded
	 public String returnTitle() {
		return "<p>This is a JAVA Web Service </p>";
	}



}
