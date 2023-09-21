package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddTest extends BaseTest{
		
		@Test
	public static void add(){
		int a =10, b=9;
		int c = a+b;
		System.out.println("Value (Addition)- " + c);

	}

}
