package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	// page locators

	private By userName = By.id("email");
	private By passWord = By.id("pass");
	private By loginButton = By.xpath("//button[@name='login']");
	private By headerTile = By.xpath("//img[@class='fb_logo _8ilh img']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// getters

	public WebElement getUserName() {
		return getElement(userName);
	}

	public WebElement getPassWord() {
		return getElement(passWord);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	public String getLoginPageTile() {
		return getPageTitle();
	}

	public String getHeaderTile() {
		return getPageHeader(headerTile);
	}

	public HomePage doLogin(String userName, String pwd) {
		getUserName().sendKeys(userName);
		getPassWord().sendKeys(pwd);
		getLoginButton().click();
		return getInstance(HomePage.class);
	}
}
