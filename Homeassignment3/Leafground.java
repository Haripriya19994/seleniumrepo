package Homeassignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String pageTitle=driver.getTitle();
		if (pageTitle=="Dashboard") 
		{
			System.out.println("Title of the Page is Dashboard");
		}
		
		driver.navigate().back();
        WebElement element = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']"));
      if(element.isEnabled()) {
    	System.out.println("Enabled");
	}else
	{
		System.out.println("Disabled");
	}
	WebElement submit = driver.findElement(By.id("j_idt88:j_idt94"));
	if(submit.isEnabled())
    {
    	System.out.println("Submit");
    
    }
    WebElement save = driver.findElement(By.id("j_idt88:j_idt96"));
    save.isEnabled();
    {
    	System.out.println("Find the Save button color");
    }
    WebElement submit1 = driver.findElement(By.id("j_idt88:j_idt98"));
   submit1.getLocation();
   {
   System.out.println("Find the height and width of this button");
   }
   driver.close();
	}
	
	
	

    
	

	}


