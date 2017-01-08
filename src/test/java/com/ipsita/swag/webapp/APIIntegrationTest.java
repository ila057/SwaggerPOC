package com.ipsita.swag.webapp;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.junit.Test;


public class APIIntegrationTest {
	private static String API_URL = "http://localhost:7070/Swagger/home/resources/sampleRequest";

	@Test
	public void testHello() throws Exception {
		Client client = Client.create();
		WebResource webResource = client.resource(API_URL);
		String response = webResource.get(String.class);

		//assertThat("", response, ("Hello, World!"));
	}
}