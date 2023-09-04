package TestPKG;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestPGM {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Clem\\Automation\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.freshworks.com/");
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.freshworks.com/");

	}
	
	@Test(priority = 1)
	public void freshWorkslogoTest() {
		boolean flag = false;
			flag = driver.findElement(By.cssSelector("a.logo.logo-fworks")).isDisplayed();
			Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void freshWorksTitleTest() {
		System.out.println("running title test...");
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "A fresh approach to customer engagement");
	}

}
