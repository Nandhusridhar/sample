package com.test;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Root;
import com.pojo.SingleFlight;
import com.pojo.Support;

public class Sample 
{
	@Test
	public void testing() throws StreamReadException, DatabindException, IOException {
		File file = new File(
				"C:\\Users\\Nandha Sridhar\\Documents\\Eclipse\\SampleAPI\\src\\test\\java\\JsonFiles\\singleFlight.json");
		ObjectMapper mapper = new ObjectMapper();
		Root readValue = mapper.readValue(file, Root.class);

		SingleFlight data = readValue.getData();
		int id = data.getId();
		System.out.println(id);
		String flightName = data.getFlightName();
		System.out.println(flightName);
		String country = data.getCountry();
		System.out.println(country);
		String destinations = data.getDestinations();
		System.out.println(destinations);
		String getuRL = data.getuRL();
		System.out.println(getuRL);
		String created_Date = data.getCreated_Date();
		System.out.println(created_Date);
		String updated_Date = data.getUpdated_Date();
		System.out.println(updated_Date);

		Support support = readValue.getSupport();
		String url = support.getUrl();
		System.out.println(url);
		String text = support.getText();
		System.out.println(text);

	}
}
