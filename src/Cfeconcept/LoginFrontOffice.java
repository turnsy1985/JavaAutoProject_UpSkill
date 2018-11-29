package Cfeconcept;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFrontOffice {
    public String baseUrl = "https://cfe1-syst.capita.zone/GTConnect/UnifiedAcceptor/CFEDesktop.Main";
    String driverPath = "C:\\Users\\p10317090\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
		
  @Test
  public void BlackRifleNavigation() {
	  
      System.out.println("It's Go Time"); 
      System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\p10317090\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);        
      driver.findElement(By.id("userName")).sendKeys("Turnss");
      driver.findElement(By.id("password")).sendKeys("@Gears1985"); 
      driver.findElement(By.id("loginButton")).click();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.findElement(By.id("f4_listboxProfileTypes_row0_col0")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("f4_btnSelect")).click();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
            
  }
}
