package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BookShelvesPage extends BasePage{
	

	public BookShelvesPage(WebDriver driver) {
		super(driver);
	}
	Actions act = new Actions(driver);

	@FindBy(xpath="//*[@id='search-results']/div[1]/h2")
	WebElement searchForText;
	
	public String searching()
	{
		return searchForText.getText();
	}
	@FindBy(xpath="//*[@id='authentication_popup']/div/div/div[2]/a[1]")
	WebElement popup;
	 
	public WebElement pop_up() {
		return popup;
	}
	
	
	@FindBy(xpath="//div[normalize-space()='Price']")
	WebElement price;
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']")
	WebElement slide;
	
	 public void moveToPrice() {
		 act.moveToElement(price).click().build().perform();
	 }
	 public void sliding() {
		 act.moveToElement(slide).dragAndDropBy(slide,-211,0).build().perform();
	 }
	 
	 @FindBy(id="filters_availability_In_Stock_Only")
	 WebElement exclude_out_of_stock;
	 
	 public void clickExcludeOutOfStock() {
		 exclude_out_of_stock.click();
	 }
	 
	 @FindBy(xpath="//*[normalize-space()='In Stock Only']")
	 WebElement inStockOnly;
	 
	 public WebElement in_Stock_Only() {
		 return inStockOnly;
	 }
	 
	 @FindBy(xpath="//div[normalize-space()='Category']")
	 WebElement category;
		
	 public void moveToCategory() {
		 act.moveToElement(category).click().perform();
	 }

	 @FindBy(id="filters_primary_category_Kids_Bookshelves")
	 WebElement items_Kids_Bookshelves;

	 public void clickKidsBookShelves() {
		 act.moveToElement(items_Kids_Bookshelves).click().perform();
	 }
	 @FindBy(xpath="//*[@id='search-results']/div[2]/div[2]/div/ul/li")
	 WebElement retprice;
	 
	 public WebElement ret_price() {
		 return retprice;
	 }
	 
	 @FindBy(xpath="//*[@id=\"search-results\"]/div[2]/div[2]/div/ul/li[2]")
	 WebElement stock_text;
	 
	 public String retstock_text() {
		 return stock_text.getText();
	 }
	 
	 @FindBy(xpath="//span[normalize-space()='Recommended']")
	 WebElement recommended;
	 
	 @FindBy(xpath="//*[@id='search-results']/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[3]")
	 WebElement priceRange;
	 
	 public void clickHighToLow() {
		 act.moveToElement(recommended).moveToElement(priceRange).click().build().perform();
		 
	 }
	 @FindBy(xpath="//*[@id='search-results']/div[2]/div[1]/div/div/div/div/div[2]/div[1]/span")
	 WebElement valHigh2Low;
	 
	 public WebElement val_High_to_Low() {
		 return valHigh2Low;
	 }
	 
	 @FindBy(xpath="//div[@class='product-title product-title-sofa-mattresses']")
	 List<WebElement> itemNames;
	 
	 public List<WebElement> item_Names(){
		 return itemNames;
	 }
	 @FindBy(xpath="//div[@class='price-number']/span")
	 List<WebElement> priceDetails;
	 
	 public List<WebElement> prices(){
		 return priceDetails;
	 }
	 
	 @FindBy(xpath="//div[@class='price-text']")
	 List<WebElement> emiAmount;
	 
	 public List<WebElement> emiAmountDetail(){
		 return emiAmount;
	 }
	 

	
}
