package com.ipsita.swag.webapp;

import com.google.gson.Gson;
import com.ipsita.swag.service.APIService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

@Path("resources")

@Api( value = "/userAPIs", description = "return user Info")
public class APIWebapp {
	private static APIService helperService = new APIService();

	@ApiOperation(
			value = "get api",
			notes = "get api notes"
	)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 500, message = "error")
	})

	@Path("getRequest/{id}/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") int id)
	{
		List<Map<String, String>> result = null;
		result= helperService.getResult(id);
		return Response.ok( new Gson().toJson(result)).build();

	}


	@ApiOperation(
			value = "put api",
			notes = "put api notes"
	)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 500, message = "error")
	})

	@Path("putRequest/{id}/")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response putUser(@PathParam("id") int id)
	{
		List<Map<String, String>> result = null;
		result= helperService.getResult(id);
		return Response.ok().build();

	}

	@ApiOperation(
			value = "post api",
			notes = "post api notes"
	)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 500, message = "error")
	})

	@Path("postRequest/{id}/")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response postUser(@PathParam("id") int id, @QueryParam("value") int value)
	{
		return Response.ok().build();

	}

	@ApiOperation(
			value = "delete api",
			notes = "delete api notes"
	)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 500, message = "error")
	})

	@Path("deleteRequest/{id}/")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUser(@PathParam("id") int id)
	{
		return Response.ok().build();

	}
}
