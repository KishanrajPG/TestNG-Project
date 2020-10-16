package TestPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest_2 {
	
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kishanraj PG\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://uniform.upskills.in/admin/index.php?route=common/dashboard&token=L6urkmK3ryWQKVw7gHsOYuitlyxzUKeu");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("admin");
		
		
		Thread.sleep(1000);
	driver.findElement(By.id("input-password")).sendKeys("admin@123");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@class='parent']")).click();
	Thread.sleep(1000);

	
	Actions action = new Actions(driver);
    WebElement webelement = driver.findElement(By.xpath("//*[@class='parent']"));
    action.moveToElement(webelement).moveToElement(driver.findElement(By.xpath(("//*[@id= 'catalog']/ul/li[2]/a")))).click().build().perform();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
	driver.findElement(By.id("input-name1")).sendKeys("Blazer Girls(7-8)");
	driver.findElement(By.id("input-meta-title1")).sendKeys("Blazer for Girls");
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Data")).click();
	
	driver.findElement(By.id("input-model")).sendKeys("BLG-112");
	
	driver.findElement(By.id("input-price")).sendKeys("3000");
	
	driver.findElement(By.id("input-quantity")).sendKeys("100");
	
	driver.findElement(By.linkText("Links")).click();
	
	driver.findElement(By.id("input-category")).sendKeys("s");
	Thread.sleep(1000);
//	Robot actionn = new Robot();
	Actions actionn = new Actions(driver);
	WebElement a = driver.findElement(By.linkText("Sports Uniform"));
	actionn.moveToElement(a).click().build().perform();
	
	Thread.sleep(1000);
//	actionn.sendKeys(Keys.ARROW_DOWN).build().perform();
	
//	actionn.sendKeys(Keys.ENTER).build().perform();
	
	//actionn.keyPress(KeyEvent.VK_DOWN);

//	driver.findElement(By.xpath("//*[@class='col-sm-10'/ul/li[2]"));
//	WebElement cat = driver.findElement(By.xpath("//*[@class='col-sm-10'/ul/li[2]"));
	//Select dropdown = new Select(cat); 

	//Select cat = new Select (driver.findElement(By.xpath("//*[@class='well well-sm']")));
	   
	 
	 //cat.selectByValue("466"); 
	
	
	
	//Actions actionn = new Actions(driver);
	//  WebElement cat = driver.findElement(By.xpath("//*[@class='dropdown-menu']"));
	// actionn.moveToElement(cat).moveToElement(driver.findElement(By.xpath(("//*[@class='dropdown-menu'']/ul/li[1]/a")))).click().build().perform();
	//	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Discount")).click();
	
	driver.findElement(By.xpath("//*[@data-original-title='Add Discount']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.name("product_discount[0][quantity]")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.name("product_discount[0][price]")).sendKeys("200");
	Thread.sleep(1000);
	driver.findElement(By.name("product_discount[0][date_start]")).sendKeys("2020-10-14");
	Thread.sleep(1000);
	driver.findElement(By.name("product_discount[0][date_end]")).sendKeys("2020-10-15");
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Reward Points")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("input-points")).sendKeys("20");
	
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("Attribute")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Option")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Recurring")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Special")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Image")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Design")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
	
	
}
}
