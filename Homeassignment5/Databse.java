package Homeassignment5;

public abstract class Databse implements DatabaseConnection{

	@Override
	public void connect() {
System.out.println("connect");		
	}

	@Override
	public void disconnect() {
System.out.println("disconnect");		
	}

	@Override
	public void executeUpdate() {
System.out.println("update");		
	}
	

}

