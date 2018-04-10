package executionEngine;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
public class WebDriverCommands_2 {
 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.close();

	}

}
