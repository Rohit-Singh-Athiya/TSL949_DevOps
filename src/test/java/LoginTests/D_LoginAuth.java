package LoginTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D_LoginAuth 
{

	WebDriver driver ;
	  @Test
	  public void doLogin() 
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.udemy.com/");
		  driver.findElement(By.xpath("//span[normalize-space()= 'Log in']")).click();
		 
		
		  Assert.assertEquals(driver.getTitle(),"Attention Required! | Cloudflare");

	  }
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() throws Exception
	  {
		  Thread.sleep(2000);
		  driver.quit();
	  }

	
}
