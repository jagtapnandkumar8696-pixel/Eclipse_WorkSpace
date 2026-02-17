package crg.NewAPI;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest extends PostBody{
	@Test
	public void postActivitesis()
	{
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		JSONObject reqParameter= new JSONObject();
		reqParameter.put("id", "1");
		reqParameter.put("title", "Tester");
		reqParameter.put("dueDate", "2021-10-12T02:32:05.477Z");
		reqParameter.put("completed", "true");
		request.body(reqParameter.toString());
		Response response=RestAssured.post("https://fakerestapi.azurewebsites.net/api/v1/Activities");
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		String str=response.asString();
		System.out.println("Response is "+str);
		
	}
	@Test
	public void postActivitesis2()
	{
		
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		JSONObject reqParameter= new JSONObject();
		
		request.body(activityBody());
		Response response=RestAssured.post("https://fakerestapi.azurewebsites.net/api/v1/Activities");
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		
	}
}
