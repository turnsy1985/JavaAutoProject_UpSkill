package exampleJavaScenarios;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlackRifleNav_TESTNG {
    public String baseUrl = "https://www.blackriflecoffee.com/";
    String driverPath = "C:\\Users\\p10317090\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
		
  @Test
  public void BlackRifleNavigation() {
	  
      System.out.println("It's Go Time"); 
      System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\p10317090\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "BLACK RIFLE COFFEE COMPANY – Black Rifle Coffee Company";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.close();	  
  }
}
