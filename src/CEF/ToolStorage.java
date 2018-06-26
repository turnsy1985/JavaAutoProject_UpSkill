package CEF;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolStorage {
    public String baseUrl = "https://www.cef.co.uk/";
    String driverPath = "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe";
    public WebDriver driver ; 
		
  @Test
  public void ToolStorage() {
	  
      System.out.println("Engaging"); 
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome to CEF | Electrical Wholesalers / Suppliers";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      String Title = driver.getTitle();
	  System.out.println(Title);	
	  driver.findElement(By.id("q")).sendKeys("Tool Storage");	
	  driver.findElement(By.className("pull-right")).click();
	  driver.findElement(By.xpath("//img[@src='https://04646a9cf351cc0d3888-b8b406d15fe93f790abb5bf0e9ab7ab3.ssl.cf3.rackcdn.com/images/products/small/birchwood_s10250_432e5276150390ff58cfa4fced8424ca.jpg?1482956825']")).click();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      driver.close();	
  }
}
