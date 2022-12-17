package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectQ2 extends BaseDriverQ2 {
	
	@Test (priority = 0)
		public void openUrl() throws InterruptedException {
			driver.get(itera);
			driver.manage().window().maximize();
		}
	
	@Test(priority = 1)
	public void navigateTest() throws InterruptedException {
		WebElement country = driver.findElement(By.xpath("//select[@class='custom select']")).click();
		select.selectByVisibleText("Norway");
		
		Thread.sleep(5000);
		

	}


	

}
