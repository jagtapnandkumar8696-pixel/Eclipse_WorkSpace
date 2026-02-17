package api.RahulSheety;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.json.JsonDelegate;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod  extends PostBody{
	@Test
	public String post()
	{
	RestAssured.baseURI="https://rahulshettyacademy.com";
	RequestSpecification request=RestAssured.given();
	request.header("Content-Type","application/json");
	request.queryParam("key", "qaclick123");
	request.body(bodynew());
	Response respons=request.post("maps/api/place/add/json");
	//Response respons=RestAssured.post("maps/api/place/add/json");
	String str=respons.asString();
	System.out.println("Response is "+str);
	JSONObject jso=new JSONObject(str);
	String actual=(String) jso.get("status");
	System.out.println("Status is "+actual);
	String expected="OK";
	Assert.assertEquals(actual, expected,"Executed");
	String place_id=(String) jso.get("place_id");
	System.out.println(place_id);
	return place_id;
	
	}
	
	

}
