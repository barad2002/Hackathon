package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GiftCardsPage extends BasePage{
	
	
	//WebDriver driver;
	public GiftCardsPage(WebDriver driver) {
		super(driver);
		
	}
    // Locating Gift cards Button and filling the necessary details
	@FindBy(xpath="//a[@class='featuredLinksBar__link' and @href='../../gift-cards?src=header']")
	public WebElement GiftCards;
	
	@FindBy(xpath="//h1[normalize-space()='Gift Cards']")
	public WebElement CheckGiftCards;
	
	@FindBy(xpath="//img[@alt='Birthday/Anniversary Gift Card by Urban Ladder']")
	public WebElement ReachBirthday;
	
	@FindBy(xpath="//p[contains(text(),'Gift something memorable to help them celebrate great memories!')]/following::button[1]")
	public WebElement ChooseBirthday;
	
	@FindBy(xpath="//input[@id='ip_2251506436']")
	public WebElement EnterAmount;
	
	@FindBy(xpath="//option[@value='4/2024']")
	public WebElement EnterMonth;
	
	@FindBy(xpath="//*[@id='app-container']/div/main/section/section[2]/div/section[2]/div[4]/select[2]")
	
	public WebElement EnterDay;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	public WebElement ClickNext;

	
	//Locating the recipient's details and filling the details
    @FindBy(xpath="//input[@id='ip_4036288348']")
    WebElement Recipientsname;
    
    @FindBy(xpath="//input[@id='ip_137656023']")
    public WebElement RecipientsEmail;
    
    @FindBy(xpath="//input[@id='ip_3177473671']")
    public WebElement RecipientNumber;
    
    //Locating the Customer's Detail
    
    @FindBy(xpath="//input[@id='ip_1082986083']")
    public WebElement Name;
    
    @FindBy(xpath="//input[@id='ip_4081352456']")
    public WebElement Email;
    
    @FindBy(xpath="//input[@id='ip_2121573464']")
    public WebElement Number;
    
    @FindBy(xpath="//input[@id='ip_2194351474']")
    public WebElement Address;
    
    @FindBy(xpath="//input[@id='ip_567727260']")
    public WebElement pincode;
    
    @FindBy(xpath="//button[contains(text(),'Confirm')]")
    public WebElement Confirm;
    
    @FindBy(xpath="//span[contains(text(),'Proceed to payment')]")
    public WebElement Payment;
    
    @FindBy(xpath="//li[@class='_2tx0o']")
    public WebElement errormsg;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[1]/div[2]")
    WebElement afAmount;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[1]/div[2]/div[1]")
    WebElement repName;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[1]/div[2]/div[2]")
    WebElement repEmail;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[1]/div[2]/div[3]")
    WebElement repMobile;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[1]")
    WebElement toName;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[2]")
    WebElement toEmail;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[3]")
    WebElement toMobile;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[4]")
    WebElement toAddress;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/section[3]/div[2]/div[2]/div[2]/div[5]")
    WebElement toPinCode;
    
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section[4]/div[2]/h2")
    WebElement valCheck;
    
    public boolean confirmDetails() {
    	return valCheck.isDisplayed();
    }
    public String afterSubmitAmount() {
    	String amount = afAmount.getText();
    	amount = amount.replaceAll("[^0-9]", "");
    	amount = amount.replaceAll(",", "");
    	return amount;
    }
    
    public String recName() {
    	return repName.getText();
    	}
    
    public String recEmail() {
    	return repEmail.getText();
    }
    
    public String recMobile() {
    	return repMobile.getText();
    }
    
    public String toname() {
    	return toName.getText();
    }
    
    public String toemail() {
    	return toEmail.getText();
    	
    }
    public String tomobile() {
    	return toMobile.getText();
    }
    
    public String toaddress() {
    	return toAddress.getText();
    }
    public String topincode() {
    	String pincode = toPinCode.getText();
    	String[] str = pincode.split(", ");
    	return str[0];
    }
	public void clickGiftcards() {
		try {
			Thread.sleep(2000);
			GiftCards.click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String checkGiftCards()
	{
		return CheckGiftCards.getText();
	}
	
	public void clickBirthday(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.moveToElement(ReachBirthday).build().perform();
		ChooseBirthday.click();
	}
	
	public void Enteramount(String amount) {
		EnterAmount.sendKeys(amount);
	}
	
	public void Entermonth() {
		EnterMonth.click();
	}
	
	public void Enterday() {
		EnterDay.click();
		Actions act = new Actions(driver);
		EnterDay.sendKeys("24");
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
	}

	
	public void Clicknext() {
		ClickNext.click();
	}
	
	public void EnterToDetails(String name,String email,String mobile) {
		
		Recipientsname.sendKeys(name);	
		RecipientsEmail.sendKeys(email);
	    RecipientNumber.sendKeys(mobile);
	}
	
	
	public void EnterCustomerDetails(String name,String email,String mobile,String address,String pinCode) throws InterruptedException
	{  
    	
    	
    Name.sendKeys(name);
    Email.sendKeys(email);
    Address.sendKeys(address);
    Number.sendKeys(mobile);
    pincode.sendKeys(pinCode);
    Thread.sleep(2000);
    Confirm.click();
   
	}
	
	public void clickpayment(WebDriver driver) throws InterruptedException {
    	
    	Thread.sleep(5000);
    	JavascriptExecutor js= (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,150)");
    	Thread.sleep(5000);
    	Confirm.click();
    	Thread.sleep(3000);

	}



	
	

}
