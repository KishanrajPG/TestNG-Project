package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest_1 {
	
	  WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kishanraj PG\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://uniformm1.upskills.in/");
		driver.manage().window().maximize();
	  
		driver.findElement(By.xpath("//*[@id='banner0']")).click();
		
		
		driver.findElement(By.xpath("//*[@class='img-responsive']")).click();
		
		//driver.findElement(By.xpath("//*[@id='input-option382']")).click();
		
		Select cat = new Select (driver.findElement(By.xpath("//*[@id='input-option382']")));
		
		cat.selectByVisibleText("32");
		
		driver.findElement(By.xpath("//*[@id='button-cart']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Checkout")).click();
		
		//driver.findElement(By.xpath("//*[@class='fa fa-share']")).click();
		Thread.sleep(3000);
		
		WebElement radio1 =  driver.findElement(By.xpath("//input[@value='guest']"));
		
		radio1.click();
		
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='button-account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Kishanraj");
		Thread.sleep(1000);
		driver.findElement(By.id("input-payment-lastname")).sendKeys("PG");
		Thread.sleep(1000);
		driver.findElement(By.id("input-payment-email")).sendKeys("abcdef@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-payment-telephone")).sendKeys("9964693517");
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-payment-address-1")).sendKeys("State Bank");
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-payment-address-2")).sendKeys("Mangaluru");
		Thread.sleep(1000);
		driver.findElement(By.id("input-payment-city")).sendKeys("Mangaluru");
		Thread.sleep(1000);
		driver.findElement(By.id("input-payment-postcode")).sendKeys("574221");
		
		Thread.sleep(1000);
Select count = new Select (driver.findElement(By.xpath("//*[@id='input-payment-country']")));
		
		count.selectByVisibleText("India");
		Thread.sleep(1000);
Select state = new Select (driver.findElement(By.xpath("//*[@id='input-payment-zone']")));
		
		

		state.selectByVisibleText("Karnataka");
		Thread.sleep(1000);
		driver.findElement(By.id("button-guest")).click();
		Thread.sleep(2000);
		
		WebElement sendtext= driver.findElement(By.xpath("//*[@name='comment']"));
	//	Thread.sleep(2000);
		sendtext.click();
		
		sendtext.sendKeys("This is a comment");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("button-shipping-method")).click();
		Thread.sleep(2000);
		
		WebElement radio2 =  driver.findElement(By.xpath("//*[@value='1' and @name='agree']"));
		radio2.click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("agree")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.id("button-shipping-method")).click();
		 driver.findElement(By.xpath("//*[@id='button-payment-method']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("button-confirm")).click();
		
		Thread.sleep(1000);
		
		//*[@class='fa fa-share']/ul/li[2]/a[2]
		
		
		
		
  }
}
