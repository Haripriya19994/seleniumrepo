package Homeassignment4;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashonDelivery() {
System.out.println("cash");		
	}

	@Override
	public void upipayments() {
System.out.println("payments");		
	}

	@Override
	public void cardpayments() {
System.out.println("card payment");		
	}

	@Override
	public void internetBanking() {
System.out.println("internet banking");	
	}
public void recordpaymentsDetails() {
	
System.out.println("record details");
}
}
