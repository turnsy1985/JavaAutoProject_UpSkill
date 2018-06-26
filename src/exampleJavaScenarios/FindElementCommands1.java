package exampleJavaScenarios;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
public class FindElementCommands1 {
	
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the ToolsQA WebSite
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");

		// Type Name in the FirstName text box      
		driver.findElement(By.name("firstname")).sendKeys("Simon"); 

		//Type LastName in the LastName text box
		driver.findElement(By.name("lastname")).sendKeys("Turns");

		// Click on the Submit button
		driver.findElement(By.id("submit")).click();
	}
}