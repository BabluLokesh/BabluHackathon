package bookShelves;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExcelUtilis.UtilisFile;
import ExcelUtilis.UtilisFile;
import pageObjectmodel.ScrollToElement;
import pageObjectmodel.giftcardPage;
import pageObjectmodel.homePage;
import pageObjectmodel.livingPage;

public class BookShelves 
{
  public  WebDriver driver;
  public  homePage hp;
  public  livingPage lp;
  public giftcardPage gf;
  public ScrollToElement sc;
  public JavascriptExecutor je;
  List<String> price=new ArrayList<String>();
  List<String> name=new ArrayList<String>();
  List<String> items=new ArrayList<String>();
  
  @BeforeClass
  public void open_Home_page()
  {
	  driver =new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String url="https://www.urbanladder.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
  }
  @Test(priority=1)
  public void open_BookShelves()
  {
	  hp= new homePage(driver);
	  hp.SearchBookshelves();
	  hp.Clicksearch();
  }
  @Test(priority=2)
  public void close_popup()
  {
	  try 
	  {
		  hp=new homePage(driver);
		  hp.Closepopup();
	  }
	  catch (Exception e )
	  {
			System.out.println("Website Opened");
	  }
  }
  @Test(priority=3)
  public void  open_category() throws InterruptedException
  {   hp= new homePage(driver);
	  hp.Opencategory();
	  hp.Clickbookshelves();
  }
  @Test(priority=4)
  public void price_selection() throws InterruptedException
  {
	  
	  Thread.sleep(5000);
	  hp.Clickprice();
	  //slider 
	  hp.Dragpriceslider();
  }
  @Test(priority=5)
  public void Click_Excludeoutof_stock() throws InterruptedException
  {
	  
	  hp.ClickExcludeoutofstock();
	  Thread.sleep(2000);
  }
  @Test(priority=6)
  public void Select_recommended() throws InterruptedException
  {   hp=new homePage(driver);
	  hp.Clickrecommended();
      Thread.sleep(5000);
      hp.Selectprice();
      
  }
  @Test(priority=7)
  public void Collect_Displayed_Namesofitems() throws FileNotFoundException
  {
	  hp. Collectitemnames();
  }
  @Test(priority=8)
  public void Collect_Displayed_Pricesofitems() throws FileNotFoundException
  {
	  hp.Collectitemsprices();
  }
  @Test(priority=9)
  public void open_Living() 
  {
	  lp= new livingPage(driver);
	  lp.Clickliving();
  }
  
  @Test(priority=10)
  public void Select_SeatingandChairs()
  {
	  
	  lp.ClickSeatingandchairs();
	  
  }
  @Test(priority=11)
  public void Collect_listeditems_ofSeatingandchairs() throws IOException, InterruptedException
  {  
      Thread.sleep(2000);
      lp.Collectdisplayeditems();
     
	        
	}
    @Test(priority=12)
    public void go_to_giftcards()
    {
    	
    	lp.gotogiftcard();
    	
    }
    @Test(priority=13)
    public void Scroll_Toheading() throws InterruptedException
    {
    	gf= new giftcardPage(driver);
    	sc=new ScrollToElement(driver);
    	Thread.sleep(5000);
    	gf.scrollheading();
    	
    }
    
    @Test(priority=14)
    public void  Select_Annivesary()
    {
    	gf=new giftcardPage(driver);
    	gf.Clickanniversary();
    }
    
    @Test(priority=15)
    public void coustmize_giftcard()
    {
    	gf= new giftcardPage(driver);
    	gf.Amountselection();
    }
    @Test(priority=16)
    public void Select_date() throws InterruptedException
    {   
        gf.SelectMonth();
        gf.SelectDate();
        Thread.sleep(2000);
    	gf.ClickNext();
    }
    
    @Test(priority=17)
    public void fill_the_form() throws InterruptedException
    {
    	gf= new giftcardPage(driver);
    	gf.RecepientName();
    	gf.SenderName();
    	gf.RecepientEmail();
    	gf.SenderEmail();
    	gf.EroorMessage();
    	gf.RecepientNo();
    	gf.SenderNo();
    	gf.RecepientsAddress();
    	gf.Pincode();
    	Thread.sleep(2000);
    	
    }
    
    @Test(priority=18)
    public void Click_confirm() throws InterruptedException, IOException 
    {   
    	gf=new giftcardPage(driver);
    	Thread.sleep(2000);
    	gf.Clickconfirm();
    }
    
    @Test(priority=19)
    public void Refill_details() throws InterruptedException
    {
        driver.navigate().refresh();
        gf.Scrolltop();
        gf.scrollheading();
        gf.Clickanniversary();
        gf.Amountselection();
        Thread.sleep(2000);
        gf.SelectMonth();
        gf.SelectDate();
    	
    	gf.ClickNext();
    }
    	
        
   @Test(priority=20)
   public void valid_details() throws InterruptedException
   {
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
   
   @Test(priority=21)
   public void click_confirm() throws InterruptedException
   {
	
	       
	    	gf=new giftcardPage(driver);
	    	Thread.sleep(2000);
	    	gf.clickconfirm();
	    
   }
    
  
  
  @AfterClass
  public void tear_down()
  {
	  driver.quit();
  }
}
