package exampleJavaScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		Thread.sleep(5000);
		
        // Close the driver
        driver.quit();
    }
}