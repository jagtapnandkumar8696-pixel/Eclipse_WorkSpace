package api.RahulSheety;

public class UpdateBody {
	public static String updateBody()
	
	{
		PostMethod pm=new PostMethod();
		String place_Id=pm.post();
		String Address ="Pune,Saswad";
		return"{\r\n" +
			      "\"place_id\":\""+place_Id+"\",\r\n" +
			      "\"address\":\""+Address+"\",\r\n" +
			      "\"key\":\"qaclick123\"\r\n" +
			      "}";
	}

}
