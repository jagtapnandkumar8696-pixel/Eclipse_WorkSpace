package test.API;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIRequest {
	
	public String getRequest(int id)
	{
		RequestSpecification request=RestAssured.given();
		Response response =request.get("https://reqres.in/api/users/"+id);
		int statuscode=response.getStatusCode();
		String str=response.asString();
		return str;
		
	}
	@Test
	public void emp()
	{
		String str=getRequest(7);
		System.out.println(str);
	}
	@Test
	public void postRequest()
	
	{
		RequestSpecification request=RestAssured.given();
		JSONObject reqParameter= new JSONObject();
		reqParameter.put("name", "Nandkumar");
		reqParameter.put("job", "Tester");
		request.body(reqParameter.toString());
		
		Response Response=request.post("https://reqres.in/api/users");
		
		int scode=Response.getStatusCode();
		System.out.println("Status code for Patch request is "+scode);
		String s=Response.asString();
		System.out.println("Response Data="+s);
		JsonPath responseid=new JsonPath(s);
		String id=responseid.get("id");
		System.out.println("Id is -->"+id);
		
	}
	@Test
	public void patchRequest()
	{
		RequestSpecification request=RestAssured.given();
		JSONObject parameter=new JSONObject();
		parameter.put("name", "Atul");
		parameter.put("job", "QA");
		request.body(parameter.toString());
		
		Response response=request.patch("https://reqres.in/api/users/2");
		int scode=response.getStatusCode();
		String str=response.asString();
		System.out.println(str);
		int expected=200;
		System.out.println("Status code for Patch request is "+scode);
		Assert.assertEquals(scode, expected);
		System.out.println("Updated Successfully");
		
				
	}
	@Test
	public void deleteRequest()
	{
		RequestSpecification request=RestAssured.given();
		Response response=request.delete("https://reqres.in/api/users/2");
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);

	}

}
