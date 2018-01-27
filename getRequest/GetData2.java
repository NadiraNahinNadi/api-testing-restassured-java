package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetData2 {
	
	@Test
	public void testResponsecode()
	{
		
		int code = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907").getStatusCode();
		
		System.out.println("Status code is "+code);
		
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testBody()
	{
		
		String data = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907").asString();
		
		long time = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907").getTime();
		
		System.out.println("Data is "+data);
		
		System.out.println("Response time "+time);
	}		
}