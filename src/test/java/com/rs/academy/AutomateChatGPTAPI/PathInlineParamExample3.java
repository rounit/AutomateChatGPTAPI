package com.rs.academy.AutomateChatGPTAPI;

import java.util.*;

import io.restassured.RestAssured;

public class PathInlineParamExample3 {

	public static void main(String[] args) 
	{
		
		Map<String,Object> pathParameter = new HashMap<>();
		pathParameter.put("basePath", "booking");
		pathParameter.put("bookingId", 2);
		
		RestAssured
		.given()
		         .log()
		         .all()
		         .baseUri("https://restful-booker.herokuapp.com/")
		         .basePath("{basePath}/{bookingId}")
		         .pathParams(pathParameter)
		 .when()
		        .get()
		  .then()
		         .log().all();      

	}

}
