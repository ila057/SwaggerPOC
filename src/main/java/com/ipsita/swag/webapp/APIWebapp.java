package com.ipsita.swag.webapp;

import com.google.gson.Gson;
import com.ipsita.swag.service.APIService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

@Path("resources")
public class APIWebapp {
	private static APIService helperService = new APIService();

	/**
	 * sth
	 * @param id sth
	 * @return sth
	 */
	@Path("getRequest/{id}/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") int id)
	{
		List<Map<String, String>> result = null;
		result= helperService.getResult(id);
		return Response.ok( new Gson().toJson(result)).build();

	}

	/**
	 * sth
	 * @param id sth
	 * @return sth
	 */
	@Path("putRequest/{id}/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response putUser(@PathParam("id") int id)
	{
		List<Map<String, String>> result = null;
		result= helperService.getResult(id);
		return Response.ok().build();

	}


	/**
	 * sth
	 * @param id sth
	 * @param value sth
	 * @return sth
	 */
	@Path("postRequest/{id}/")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response postUser(@PathParam("id") int id, @QueryParam("value") int value)
	{
		return Response.ok().build();

	}


	/**
	 * sth
	 * @param id sth
	 * @return sth
	 */
	@Path("deleteRequest/{id}/")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUser(@PathParam("id") int id)
	{
		return Response.ok().build();

	}
}
