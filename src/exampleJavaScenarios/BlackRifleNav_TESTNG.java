package exampleJavaScenarios;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlackRifleNav_TESTNG {
    public String baseUrl = "https://www.blackriflecoffee.com/";
    String driverPath = "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe";
    public WebDriver driver ; 
		
  @Test
  public void BlackRifleNavigation() {
	  
      System.out.println("It's Go Time"); 
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "BLACK RIFLE COFFEE COMPANY – Black Rifle Coffee Company";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.close();	  
  }
}
