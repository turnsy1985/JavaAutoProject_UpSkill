package executionEngine;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {

	public WebDriver driver;
	

  @Test

  public void main() {

		// Type Name in the FirstName text box      
		driver.findElement(By.name("firstname")).sendKeys("Simon"); 

		//Type LastName in the LastName text box
		driver.findElement(By.name("lastname")).sendKeys("Turns");

  }

  @BeforeMethod

  public void beforeMethod() {

	  // Create a new instance of the Firefox driver

	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //Launch the Online Store Website

      driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");

  }

  @AfterMethod

  public void afterMethod() {

		// Click on the Submit button
		driver.findElement(By.id("submit")).click();

  }

}