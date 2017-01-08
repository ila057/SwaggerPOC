package com.ipsita.swag.webapp;

import com.google.gson.Gson;
import com.ipsita.swag.service.APIService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

@Path("resources")

@Api( value = "/getUser", description = "return user Info")
public class APIWebapp {
	private static APIService helperService = new APIService();

	@ApiOperation(
			value = "method api",
			notes = "method api notes"
	)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 500, message = "error")
	})

	@Path("sampleRequest/{id}/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") int id)
	{
		List<Map<String, String>> result = null;
		result= helperService.getResult(id);
		return Response.ok( new Gson().toJson(result)).build();

	}
}
