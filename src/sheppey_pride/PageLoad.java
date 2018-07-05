package sheppey_pride;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageLoad {
    public String baseUrl = "https://www.sheppeypride.co.uk/";
    String driverPath = "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe";
    public WebDriver driver ; 
		
  @Test
  public void PageLoad() {
	  
      System.out.println("Engaging"); 
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Sheppey Pride | Isle of Sheppey Community";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      String Title = driver.getTitle();
		System.out.println(Title);
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      driver.close();	  
  }
}
