/**
 * 
 */
package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

/**
 * @author ponraj_n
 *
 */
public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {

		String title = page.getInstance(LoginPage.class)
				.getLoginPageTile();
		System.out.println("Fb Login page title is -->" +title);
	}
	
	/*
	 * @Test(priority = 2) public void verifyLoginPageHeaderTxt() { String
	 * titleHeader = page.getInstance(LoginPage.class) .getHeaderTile();
	 * System.out.println(titleHeader); }
	 */
	  
	  @Test(priority = 2) 
	  public HomePage doLoginTest() {  
		  return  page.getInstance(LoginPage.class).doLogin("ponraj871985", "Naindira4436562");
	  }
	 
}
