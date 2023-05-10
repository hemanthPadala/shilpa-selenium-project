package firsttestngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Humana {

	public ChromeDriver driver;
	
	@BeforeTest
	  public void initializechrome() {
		 String Path = "/usr/local/bin/chromedriver";
	 	    System.getProperty("webdriver.chrome.driver",Path);

	 		 driver = new ChromeDriver();
	 		 
	 		 driver.get("https://plans.humana.com/");
	}
	
	@Test
	public void verifyzipcode() {
	
		
	}
     @Test
     public void medicareplans() {   	
 		 WebElement element=driver.findElement(By.xpath("//*[@id=\'ZIP Code\']"));
 			element.sendKeys("40202");			
 			WebElement element1=driver.findElement(By.xpath("//*[@id=\'main\']/div/section/div/div/div/div/div[1]/form/div/div[2]/button/span"));
 			element1.click();
 			try {
 				Thread.sleep(5000);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
    	// WebElement radioButton=driver.findElement(By.id("nucleus-radio-button-4")); 	 
    	 WebElement radioButton=driver.findElement(By.cssSelector("input[name='coveragetype[medicareAdvantage]']"));
    	 radioButton.click();
    	 WebElement element2=driver.findElement(By.xpath("//*[@id=\'main\']/div/section/div/div/form/div/div[2]/button[2]"));
    	 element2.click();  
    	 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     }
}
  