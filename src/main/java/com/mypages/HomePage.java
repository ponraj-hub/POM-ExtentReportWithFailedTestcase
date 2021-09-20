package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	private By homePageHeaderTxt=By.xpath("//a[@aria-label='Facebook']");


	public String getHomePageHeaderTxt() {
		return getPageHeader(homePageHeaderTxt);
	}

}