package Homeassignment5;

public class Execution extends Databse {

	public static void main(String[] args) {
		Execution e=new Execution();
		e.connect();
		e.disconnect();
		e.executeUpdate();
	}

}
