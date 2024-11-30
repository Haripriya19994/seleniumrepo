package Homeassignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.partialLinkText("Leads")).click();
	    driver.findElement(By.partialLinkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Arudhra");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ajay");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Saba");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
	    driver.findElement(By.name("description")).sendKeys("Selenium");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
	    WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select opt=new Select(dropDown);
	    opt.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.partialLinkText("Edit")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("Important");
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    
	    
	}

}
