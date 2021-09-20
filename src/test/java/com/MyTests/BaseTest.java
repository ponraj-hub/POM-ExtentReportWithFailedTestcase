/**
 * 
 */
package com.MyTests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mypages.BasePage;
import com.mypages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author ponraj_n
 *
 */
public class BaseTest {
	WebDriver driver;
	public Page page; //page variable
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void setUpMethod(String browser) throws InterruptedException {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			
		}
		else if(browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		else {
			System.out.println("Invalid browser");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		page = new BasePage(driver);	 
}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}