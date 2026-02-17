package crg.NewAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.json.JsonDelegate;
import groovy.json.JsonOutput;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	@Test
	public void getActivities() {
		Response resTest = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Activities");

		String StrVer = resTest.asString();
		System.out.println("Azure_GetActivity=" + StrVer);
		int statusCode = resTest.getStatusCode();
		System.out.println("Status Code =" + statusCode);

		JSONArray RessJSON = new JSONArray(StrVer);
		System.out.println("Length=" + RessJSON.length());
		int length = RessJSON.length();

		for (int i = 0; i < length; i++) {

			JSONObject stOBJ = (JSONObject) RessJSON.get(i);

			// JSONArray ja1=stOBJ.getJSONArray("ArrayName")
			System.out.println("Title -" + stOBJ.get("title"));
			int id = (Integer) stOBJ.get("id");
			String title = (String) stOBJ.get("title");
			String date = (String) stOBJ.get("dueDate");
			boolean status = stOBJ.getBoolean("completed");
			// Assert.assertEquals(int id=(Integer) stOBJ.get("id"), i);
			if (title.isEmpty()) {
				Assert.fail("Title is null");
			}

		}
		System.out.println("ID/Title/Date is not null");

	}

	@Test
	private void getActivitesWithId() throws ParseException {
		Response response = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Activities/1");
		String str = response.asString();
		JSONObject jsOBJ = new JSONObject(str);
		int id = jsOBJ.getInt("id");
		String title = jsOBJ.getString("title");
		String date = jsOBJ.getString("dueDate");
		System.out.println("date" + date);
		String date1 = date.substring(0, 10);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/mm/dd");
		System.out.println("date1 is " + date1);
		Date dt = sd.parse(date1);
		Date today = new Date();
		boolean completed = jsOBJ.getBoolean("completed");
		System.out.println("ID is" + id + title + date + completed);
		/*
		 * if(dt==today) { System.out.println("Date us due today"); }
		 */

	}

	@Test
	public void author() {
		Response response = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Authors/authors/books/1");
		String str = response.asString();
		System.out.println("Response is ->" + str);
		JSONArray jsa = new JSONArray(str);
		System.out.println("Length od Array is ->" + jsa.length());
		for (int i = 0; i < jsa.length(); i++) {
			JSONObject jso = (JSONObject) jsa.get(i);
			int id = (Integer) jso.get("id");
			int bookId = jso.getInt("idBook");
			String fname = (String) jso.get("firstName");
			String lname = (String) jso.get("lastName");
			if (id <= 0 && bookId != 1 && fname == null && lname == null) {
				System.out.println("Response is incorrect ");

			}
			if (bookId == 1) {
				System.out.println("Response is correct->" + " " + id + " " + bookId + " " + " " + fname + " " + lname);
			}
		}

	}

	@Test
	public void Auther_ByID()
{
	int a1=3;
	int a_Id=authorID(a1);
	Assert.assertEquals(a1, a_Id);
	System.out.println(a1);
	System.out.println(a_Id);
}
	@Test
	public int authorID(int bId) {
		Response response = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Authors/"+bId);
		String str = response.asString();
		System.out.println("Response is ->" + str);
		JSONObject jso = new JSONObject(str);
		int id = jso.getInt("id");
		int idBook = jso.getInt("idBook");
		String fname = (String) jso.get("firstName");
		String lname = (String) jso.get("lastName");

		if (id != 5) {
			System.out.println("Response is incorrect");
		} else {
			System.out.println("Response is correct " + " " + id + " " + " " + fname + " " + lname);
		}
		return id;

	}
@Test
	public void books() 
	{
	  int smallbook=0;
	  int largebook=0;
      Response response=RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Books");
      String str=response.asString();
      System.out.println("books response="+str);
     
      JSONArray jsa=new JSONArray(str);
      for(int i=0;i<15;i++)
      {
      JSONObject jso=jsa.getJSONObject(i);
      int id=jso.getInt("id");
      int pagecount=jso.getInt("pageCount");
      String description=jso.getString("description");
      if (pagecount<=1000)
      {
    	 smallbook++;
      }
      else
      {
    	  largebook++;
      }
      
      }
      System.out.println("total small books are " +smallbook);
      System.out.println("total large books are " +largebook);
      
	}
@Test
public void bookId()
{
	Response response=RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Books/1");
	String str=response.asString();
	System.out.println(str);
	JSONObject jso=new JSONObject(str);
	String expected="Book 1";
	String title=jso.getString("title");
	Assert.assertEquals(title, expected);
	System.out.println("Actula and Expected title is same ");
}
@Test
public void coverPhoto()
{
	Response response=RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos");
	String str=response.asString();
	JSONArray jsa=new JSONArray(str);
	for(int i=0;i<5;i++)
	{
		JSONObject jso =  (JSONObject) jsa.get(i);
		jso.getInt("id");
		if(jso.getInt("id")>=6)
		{
			System.out.println("Id is not in list");
		}
		
	}
	System.out.println("Id is  in list");
}
}
