package test;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	static WebDriver driver;
	@BeforeMethod
	public static void openUrl() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("http://amazon.in/"); 
		
	}
	
	@AfterMethod
	public static void close() {
//		driver.close();
//		driver.quit();
	}
	
	public static void main(String args[]) {
		openUrl();
		SearchTest.search();
		close();
	}

}
