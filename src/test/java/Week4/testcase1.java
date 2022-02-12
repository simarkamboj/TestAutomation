package Week4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class testcase1 {
	
	WebDriver driver;
	
  @Test
  public void register() {
	  
	    driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.name("firstname")).sendKeys("simar");
		driver.findElement(By.name("lastname")).sendKeys("kamboj");
		driver.findElement(By.name("email")).sendKeys("simarpkmaan@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("4166272585");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirm")).sendKeys("123456");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")).click();
		
		
		String expectedResult="Register Account";
		String actualResult=driver.getTitle();
	
		Assert.assertEquals(actualResult, expectedResult);
		}
  
  
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
  }
  
  @AfterMethod
 public void closer() throws Exception{
	  
	  File scrFile= ( (TakesScreenshot)driver). getScreenshotAs (OutputType.FILE);
	  FileUtils.copyFile(scrFile, new File("C:\\Screenshots\\screencapture1. jpg")) ;
	  
	 // driver.quit();
	  
  }
  

}
