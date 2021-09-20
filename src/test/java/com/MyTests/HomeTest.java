package com.MyTests;

import org.testng.annotations.Test;

import com.mypages.HomePage;

public class HomeTest extends BaseTest {
	
	
	
	@Test(priority=1)
	public void getPageHeader() {
		String headerPagetTitle=page.getInstance(HomePage.class)
		.getHomePageHeaderTxt();
		System.out.println(headerPagetTitle);
		
	}
	
	@Test
	public void getPageTitle() {
		
		
	}
	

}
