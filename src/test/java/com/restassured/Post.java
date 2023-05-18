package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post 
{
	public static void main(String[] args) 
	{
		RequestSpecification reqSpec;
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type","application/json");
		reqSpec = reqSpec.body("{\r\n" + 
				"    \"flightName\": \"AirIndia\",\r\n" + 
				"    \"Country\": \"India\",\r\n" + 
				"    \"Destinations\": \"87\",\r\n" + 
				"    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + 
				"}");
		Response post = reqSpec.post("https://omrbranch.com/api/flights");
		System.out.println(post.asPrettyString());
		System.out.println(post.getStatusCode());
	}
}
