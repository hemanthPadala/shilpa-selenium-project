package firsttestngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class go365testing {
	public ChromeDriver driver;
	
	@BeforeTest
	  public void initializechrome() throws InterruptedException {
		 String Path = "/usr/local/bin/chromedriver";
	 	    System.getProperty("webdriver.chrome.driver",Path);

	 		 driver=new ChromeDriver();
	}
	 		 @Test
	 		 public void openwebsite() throws InterruptedException {
	 		 driver.get("https://account.go365.com/");
	 		 Thread.sleep(5000);
	}	 
	 		 
             @Test
             public void verifylogin() {
            	 WebElement username=driver.findElement(By.name("Username"));
            	 username.sendKeys("asdas@123.com");
            	 WebElement password=driver.findElement(By.name("Password"));
            	 password.sendKeys("45678");
            	 WebElement element=driver. findElement(By.cssSelector("button[type='submit']"));;
            	 element.click();
            	 
            	 
             }
}
