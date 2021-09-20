package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	/* Create a variable */

	WebDriver driver;
	WebDriverWait wait;

	/* Create a construct of abstract class */

	@SuppressWarnings("deprecation")
	
	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 15);
	}

	// Abstract methods
	public abstract String getPageTitle();

	public abstract String getPageHeader(By locator);

	public abstract WebElement getElement(By locator);

	public abstract void waitForElementPresent(By locator);

	public abstract void waitForPageTitlePresent(String title);

	// Generic method

	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {

		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			e.getStackTrace();
			 return null;
			 }	
	}         
}
