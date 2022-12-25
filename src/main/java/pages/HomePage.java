package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gh-btn")
	WebElement searchButton;

	@FindBy(className = "gh-cart-icon")
	WebElement cart;

	public void clickSearchButton() throws InterruptedException {
		searchButton.click();
		Thread.sleep(3000);
	}

	public void clickCart() throws InterruptedException {
		cart.click();
		Thread.sleep(3000);
	}

}
