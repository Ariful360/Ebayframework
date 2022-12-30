package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test (enabled = false, priority = 1)
	public void clickSearchButtonTest() throws InterruptedException {
		homePage.clickSearchButton();
	}

	@Test (enabled = false, priority = 2)
	public void clickCartTest() throws InterruptedException {
		homePage.clickCart();
	}
	
	@Test (enabled = true, priority = 3)
	public void clickSignInTest() throws InterruptedException {
		homePage.clickSignIn();
	}
	
}
