package stepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.BookShelvesPage;
import pageObjects.LivingPage;

public class Living extends BaseClass{
	
	LivingPage lp;
	BookShelvesPage bp;
	static WebDriverWait myWait= new WebDriverWait(driver,Duration.ofSeconds(10));
	List<WebElement> livingWebElements = new ArrayList<WebElement>();
	List<String> livingStrings = new ArrayList<String>();
	@Given("On the Living page")
	public void on_the_living_page() throws InterruptedException {
	    lp = new LivingPage(driver);
	    BaseClass.getLogger().info("Living Page....");
	    Thread.sleep(3000);;
	    lp.moveToLiving();
	    
	}

	@When("choose a sub-menu item from Seating & Chairs or Living Storage")
	public void choose_a_sub_menu_item_from_seating_chairs_or_living_storage() throws InterruptedException {
		lp = new LivingPage(driver);
		bp = new BookShelvesPage(driver);
	    BaseClass.getLogger().info("Living Page Submenu items....");
	    Thread.sleep(3000);
	    lp.clickOnLivingStorageEle();
	    Thread.sleep(4000);
	    BaseClass.getLogger().info("Verifying the Living Room Storage page is selected...");
	    //Assert.assertEquals(lp.getTextOfLivingStorage(), "Living Room Storage");
	    BaseClass.getLogger().info("Living Room Storage page is selected...");
	    
	}

	@Then("retrieve all items under the chosen sub-menu")
	public void retrieve_all_items_under_the_chosen_sub_menu() {
		lp = new LivingPage(driver);
	    BaseClass.getLogger().info("Selecting Living page subMenu items ...");
	    livingWebElements = lp.getSubElementItems();
	    BaseClass.getLogger().info("Living page subMenu items selected...");
	    
	}

	@Then("print the retrieved items in the console")
	public void print_the_retrieved_items_in_the_console() {
	   
		BaseClass.getLogger().info("Printing Living page subMenu items ...");
		int i=1;
		for(WebElement ele:livingWebElements) {
			String livDetails = ele.getText();
			System.out.println(i+": "+livDetails);
			livingStrings.add(livDetails);
			i++;
			BaseClass.getLogger().info("Living page subMenu items are printed...");
		
			
		}
	}

}
