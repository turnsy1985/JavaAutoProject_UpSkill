package executionEngine;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlackRifleNavigation {

public static <oCheck> void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
			
	// Put an Implicit wait, 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	// Launch the URL
	driver.get("https://www.blackriflecoffee.com/");	
	
	// wait for page to fully load and pop up to appear
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// Dismiss newsletter pop up
	driver.findElement(By.className("klaviyo_header_close")).click();
	
	// Coffee Collection
	driver.findElement(By.className("zoom-hover")).click();
	
	// wait for new page to fully load
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// Roast Type
	driver.findElement(By.className("abbr")).click();
	
	// wait for new page to fully load
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}