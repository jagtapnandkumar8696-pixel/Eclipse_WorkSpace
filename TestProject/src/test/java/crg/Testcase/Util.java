package crg.Testcase;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Util {
	@Test
	public static void tokenGenerator()
	{
		RestAssured.baseURI="https://172.18.152.241:44360/MobileService";
		RequestSpecification request=RestAssured.given().relaxedHTTPSValidation();
		JSONObject requestParameter=new JSONObject();
		requestParameter.put("UserName", "peter@170b.onmicrosoft.com");
		requestParameter.put("Password", "Pa55word");
		request.header("Content-Type", "application/json");
		request.header("token", "123");
		request.header("Authorization", "123");
		request.header("Device-Id","123");
		request.body(requestParameter.toString());
		request.post("/AuthenticationToken");
			


				
				
	}

}
