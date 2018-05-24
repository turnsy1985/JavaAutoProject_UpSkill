package executionEngine;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\p10317090\\eclipse-workspace\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}