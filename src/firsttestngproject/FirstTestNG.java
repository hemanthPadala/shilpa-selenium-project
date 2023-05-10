package firsttestngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	 public ChromeDriver driver ; 

	
@AfterTest 
public void terminateBrowser() {
    driver.close();
}





  @BeforeTest
  public void VerifyHomePageTitle() {
  	String Path = "/usr/local/bin/chromedriver";
    System.getProperty("webdriver.chrome.driver",Path);

	 driver = new ChromeDriver();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

    // And now use this to visit Google
    driver.get("http://www.google.com");
    
    // Find the text input element by its name
    WebElement drvr1 = driver.findElement(By.id("APjFqb"));

    // Enter something to search for
    drvr1.sendKeys("Selenium");

    // Now submit the form. WebDriver will find the form for us from the element
    drvr1.submit();
    
    
    
  }
  
  @Test
  public void testAboutPage() {
	  driver.get("https://www.selenium.dev/");
	    driver.findElement(By.id("navbarDropdown")).click();
	    driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[2]/div/a[1]")).click();

	    
	    String aboutUrl = "https://www.selenium.dev/about/";
	    
	    String currentUrl = driver.getCurrentUrl();
	   
	    Assert.assertEquals(aboutUrl,currentUrl);
  }
}
