package Homeassignment4;

public class Button extends Webelement{
public void submit()
{
	System.out.println("submit");
}
	public static void main(String[] args) {
		Button b=new Button();
		b.click();
		b.setText("priya");
	}

}
