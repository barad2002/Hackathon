package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import factory.BaseClass;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="search")
	public WebElement searchBox;
	
	public WebElement searchBoxElement() {
		return searchBox;
	}

	@FindBy(id="search_button")
	WebElement searchButton;
	
	public void clickSearchButton() {
		searchButton.click();
	}
	@FindBy(xpath="//*[@id='header']")
	WebElement head;
	public WebElement getHead() {
		return head;
	}
	@FindBy(xpath="//*[@id='header']/section/div/ul[2]/li[3]/a")
	WebElement giftCards;
	public WebElement ele() {
		return giftCards;
	}

	
	public void clickGiftCards() {
		BaseClass.explicitWait(giftCards);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", giftCards);
		js.executeScript("arguments[0].click();", giftCards);
	
	}
	
	
	
}
