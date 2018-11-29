package exampleJavaScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class Krakow_Weather {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/weather/poland/krakow/ext");
		driver.findElement(By.className("submit.round.modal-privacy__btn.fr")).click();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.timeanddate.com/countdown/vacation?p0=3329&iso=20180413T15&year=2018&month=4&day=13&hour=15&min=0&sec=0&msg=Krakow");
	}

}
