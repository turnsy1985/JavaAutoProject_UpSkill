package exampleJavaScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class TEST_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Tim Kennedy");
		driver.findElement(By.name("btnK")).click();
		driver.close();
	}
	}