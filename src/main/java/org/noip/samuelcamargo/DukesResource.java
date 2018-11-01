package org.noip.samuelcamargo;

import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.noip.samuelcamargo.model.FeedDB;

@Stateless
@Path("getDukes")
@ApplicationPath("resources")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class DukesResource extends Application {

	// @GET
	// // @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// public JsonArray dukes() {
	// return Json.createArrayBuilder().add(duke("smart", 18)).add(duke("nice",
	// 49)).add(duke("Juliano", 45)).build();
	// }

	@GET
	public String dukes() {
//		FeedDB mongo = new FeedDB();
//		mongo.getCollectionFromDB();
//		return mongo.ConnectToDB();
		return "Samuel";
	}

	@GET
	@Path("{duke}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response findBySlug(@PathParam("duke") final String dukeParam) {
		final String response = "User " + dukeParam + " not found!";
		return Response.status(Response.Status.NOT_FOUND).entity(response).build();
	}

	public JsonObject duke(String name, int age) {
		return Json.createObjectBuilder().add("name", name).add("age", age).build();
	}

}
