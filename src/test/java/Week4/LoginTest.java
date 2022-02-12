package Week4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	
	WebDriver driver;
  @Test
  public void logincheck() {
	  
	  driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
	  driver.findElement(By.partialLinkText("Login")).click();
	  driver.findElement(By.name("email")).sendKeys("simarpkmaan@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("123456");
	  driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click();
		String expectedResult="My Account";
		String actualResult=driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult);
	  
	  
  }
  @Test
  public void logincheck1() {
	  
	  driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
	  driver.findElement(By.partialLinkText("Login")).click();
	  driver.findElement(By.name("email")).sendKeys("simarpkmaan@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("12345");
	  driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click();
		String expectedResult="My Account";
		String actualResult=driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.quit();
  }

}
