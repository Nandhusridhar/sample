package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetPathParam 
{
	public static void main(String[] args) 
	{
		RequestSpecification reqSpec;
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type","application/json");
		reqSpec = reqSpec.pathParam("fNo", "6469");
		Response response = reqSpec.get("https://omrbranch.com/api/flight/{fNo}");
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());		
	}
}
