package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest_3 {
	
	 WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kishanraj PG\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://uniformm1.upskills.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@title='My Account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("abcdef@gmail.com");
		
		
		driver.findElement(By.id("input-password")).sendKeys("admin@123");
		
		Thread.sleep(2000);
	  
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Uniform Store")).click();
	  
		
		driver.findElement(By.linkText("Kishanraj PG")).click();
		
		driver.findElement(By.linkText("Order History")).click();
		
		driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
		
		
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		
		WebElement radio3 =  driver.findElement(By.xpath("//*[@value='3' and @name='return_reason_id']"));
		
		radio3.click();
		
		
		WebElement radio4 =  driver.findElement(By.xpath("//*[@value='1' and @name='opened']"));
		
		radio4.click();
		
		
		
		WebElement faultdetail= driver.findElement(By.xpath("//*[@id='input-comment']"));
		//	Thread.sleep(2000);
			faultdetail.click();
			
			faultdetail.sendKeys("Incorrect Item");
			
			WebElement radio5 =  driver.findElement(By.xpath("//*[@value='1' and @name='agree']"));
			
			radio5.click();
		
		
			 driver.findElement(By.xpath("//*[@value='Submit']")).click();
			 
  }
}
