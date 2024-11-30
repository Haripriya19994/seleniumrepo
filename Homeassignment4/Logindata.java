package Homeassignment4;

public class Logindata extends Inheritancesingle{
public void enterusername()
{
	System.out.println("enter username");
	
}
public void enterpassword()
{
	System.out.println("enter password");
	
}
	public static void main(String[] args) {
		Logindata ld=new Logindata();
		ld.enterusername();
		ld.enterpassword();
		ld.navigateToHomePage();
		ld.enterCredentials();
		
	}

}
