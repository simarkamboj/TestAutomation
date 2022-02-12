package week3;

import java.util.concurrent.TimeUnit;

//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import java.io.File;
public class TC001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
		driver.findElement(By.linkText("Add New Payee")).click();
		driver.findElement(By.id("np_new_payee_name")).sendKeys("jot");
		driver.findElement(By.name("address")).sendKeys("6666 ontario street, bramton ");
		driver.findElement(By.id("np_new_payee_account")).sendKeys("666-555-5555");
		driver.findElement(By.id("np_new_payee_details")).sendKeys("personal account");
		driver.findElement(By.id("add_new_payee")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
		
		
		
		
		
		
	//driver.quit();
		
		

	}

}
