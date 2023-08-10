package com.rs.academy.AutomateChatGPTAPI;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ChatGPTAPI 
{
	@Test(description = "Validate status code for GET list models")
	public void getUserData()
	{
		Response rsp =given().
		         header("Authorization","Bearer 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").
		         when().get("https://api.openai.com/v1/models");
		assertEquals(rsp.statusCode(),200);
		System.out.println(rsp.getBody().asString());
		System.out.println("testCase getListModels executed successfully");
	}
	
	@Test(description = "Validate status code for GET retrieve models")
	public void geRetrieveModels()
	{
		Response rsp =given().
		         header("Authorization","Bearer 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").
		         pathParam("model_id","babbage").
		         when().get("https://api.openai.com/v1/models/:model id");
		assertEquals(rsp.statusCode(),200);
		System.out.println(rsp.getBody().asString());
		System.out.println("testCase getListModels executed successfully");
	}
	
	

}
