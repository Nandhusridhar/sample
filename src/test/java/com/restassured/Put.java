package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put 
{
	public static void main(String[] args) 
	{
		RequestSpecification reqSpec;
	
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("content-type","application/json");
		reqSpec = reqSpec.pathParam("FNo", "6469");
		Response put = reqSpec.get("https://omrbranch.com/api/flight/{FNo}");
		int statusCode = put.getStatusCode();
		System.out.println(statusCode);
		
		
		
		
	}
}
