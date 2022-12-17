package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriverQ2 {
static String itera = "https://itera-qa.azurewebsites.net/home/automation";
	
	WebDriver driver;
	
	public void start() {
		
		String browser = System.getProperty("browser", "chrome");
		if (browser.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
		}
		else if (browser.contains("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
		}
		
		 else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		
		
		
	}
	
	@AfterSuite
	public void end() 
	{
	
		driver.quit();
		
	}

}
