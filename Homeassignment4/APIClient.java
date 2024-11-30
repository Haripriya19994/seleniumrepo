package Homeassignment4;

public class APIClient {
public void SendRequest(String endpoint)
{
	System.out.println("String endpoint:"+endpoint);
}
public void sendRequest(String endpoint,String requestBody,Boolean requeststatus)
{
	System.out.print("string endpoint:"+endpoint +"\n"+"request body:"+requestBody +"\n"+ "boolean:"+ requeststatus);
}
	public static void main(String[] args) {
		
		APIClient ac=new APIClient();
		ac.SendRequest("chrome");
		ac.sendRequest("edge", "request", false);
	}

}
