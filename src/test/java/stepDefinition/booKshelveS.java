package stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectmodel.ScrollToElement;
import pageObjectmodel.giftcardPage;
import pageObjectmodel.homePage;
import pageObjectmodel.livingPage;

public class booKshelveS 
{   
	WebDriver driver;
    public homePage hp;
    public livingPage lp;
    public giftcardPage gf;
    public JavascriptExecutor je;
    public ScrollToElement sc;
    List<String> price=new ArrayList<String>();
    List<String> name=new ArrayList<String>();
    List<String> items=new ArrayList<String>();
	@Given("user on the website search for BookShelves")
	public void user_on_the_website_search_for_book_shelves() 
	{
		
		 hp=new homePage(BaseClass.getDriver());
		  hp.SearchBookshelves();
		  hp.Clicksearch();
	}

	@Given("close the pop up add")
	public void close_the_pop_up_add() 
	{
		 try 
		  {
			 // hp=new homePage(driver);
			  hp.Closepopup();
		  }
		  catch (Exception e )
		  {
				System.out.println("Website Opened");
		  }
	}

	@When("user select Bookshelves under category")
	public void user_select_bookshelves_under_category() throws InterruptedException 
	{
		  //hp= new homePage(driver);
		   hp.Opencategory();
		   hp.Clickbookshelves();
	}

	@When("user gives filter price below Rs.{int}")
	public void user_gives_filter_price_below_rs(Integer int1) throws InterruptedException 
	{
		 // hp=new homePage(driver);
		  Thread.sleep(5000);
		  hp.Clickprice();
		  //slider 
		 hp.Dragpriceslider();
	}

	@When("Select excluding out-of-stock items")
	public void select_excluding_out_of_stock_items() throws InterruptedException 
	{
		  //hp= new homePage(driver);
		  hp.ClickExcludeoutofstock();
		  Thread.sleep(2000);
	}

	@When("user sort the results by price from high to low")
	public void user_sort_the_results_by_price_from_high_to_low() throws InterruptedException 
	{
		  //hp=new homePage(driver);
		   hp.Clickrecommended();
		   hp.Selectprice();
	}

	@Then("user should see top {int} bookshelves and print the Names of top {int} bookshhelves in the console output")
	public void user_should_see_top_bookshelves_and_print_the_names_of_top_bookshhelves_in_the_console_output(Integer int1, Integer int2) throws FileNotFoundException 
	{
		 hp.Collectitemnames();
	}

	@Then("user should see top {int} bookshelves and print the Prices of top {int} bookshhelves in the console output")
	public void user_should_see_top_bookshelves_and_print_the_prices_of_top_bookshhelves_in_the_console_output(Integer int1, Integer int2) throws FileNotFoundException 
	{
		hp.Collectitemsprices();
	    
	}
	@Given("user navigate and click on the living and select seating and chairs")
	public void user_navigate_and_click_on_the_living_and_select_seating_and_chairs() 
	{
		  lp= new livingPage(BaseClass.getDriver());
		  lp.Clickliving();
	}

	@When("user clicks on seating and chairs")
	public void user_clicks_on_seating_and_chairs() 
	{
	   
	}

	@Then("user should see all relevant items user print their details in the console output")
	public void user_should_see_all_relevant_items_user_print_their_details_in_the_console_output() throws IOException
	{
		   //lp=new livingPage(driver);
		   lp.ClickSeatingandchairs();
	       lp.Collectdisplayeditems();
	        
	}
    
	@Given("user click on  the gift card customization page")
	public void user_click_on_the_gift_card_customization_page() throws InterruptedException 
	{
		lp= new livingPage(BaseClass.getDriver());
    	lp.Gotogiftcard();
	}

	@When("user fill in the Customize your gift card section with valid price and date")
	public void user_fill_in_the_customize_your_gift_card_section_with_valid_price_and_date() throws InterruptedException 
	{   gf = new giftcardPage(BaseClass.getDriver());
	    Thread.sleep(5000);
		gf.Clickanniversary();
		gf.Amountselection();
		Thread.sleep(2000);
    	gf.SelectMonth();
    	gf.SelectDate();
    }

	@When("user click the Next button")
	public void user_click_the_next_button() 
	{
		gf.ClickNext();
	}

	@When("user fill in the  Nice! So who is this lucky person form details with an invalid email address and user should see an error message")
	public void user_fill_in_the_nice_so_who_is_this_lucky_person_form_details_with_an_invalid_email_address_and_user_should_see_an_error_message() throws InterruptedException 
	{
		//gf= new giftcardPage(driver);
    	gf.RecepientName();
    	gf.SenderName();
    	gf.RecepientEmail();
    	gf.SenderEmail();
    	gf.EroorMessage();
    	
    	gf.RecepientNo();
    	gf. SenderNo();
    	gf.RecepientsAddress();
    	gf.Pincode();
    	Thread.sleep(2000);
	}

	@Then("user will take screenshot of that error message")
	public void user_will_take_screenshot_of_that_error_message() throws InterruptedException, IOException 
	{
		//gf=new giftcardPage(driver);
    	Thread.sleep(2000);
    	gf.Clickconfirm();
	}

	@Then("usercorrect the email address with a valid one and validate all other details in the Confirm Details section")
	public void usercorrect_the_email_address_with_a_valid_one_and_validate_all_other_details_in_the_confirm_details_section() throws InterruptedException
	{
		    gf.refresh();
		    gf.Scrolltop();
	        gf.Scrollheading();
	        gf.Clickanniversary();
	        gf.Amountselection();
	        Thread.sleep(2000);
	    
	    	gf.SelectMonth();
	    	gf.SelectDate();
	    	
	    	gf.ClickNext();
	    	
	    	gf.RecepientName();
	    	gf.SenderName();
	    	gf.RecepientEmail();
	    	gf.Validsender();
	    	gf.EroorMessage();
	    	
	    	gf.RecepientNo();
	    	gf. SenderNo();
	    	gf.RecepientsAddress();
	    	gf.Pincode();
	    	Thread.sleep(2000);
	    	
	}

	@Then("user quit from the browser")
	public void user_quit_from_the_browser() throws InterruptedException 
	{
		//gf=new giftcardPage(driver);
    	Thread.sleep(2000);
    	gf.clickconfirm();
    
	}
}
