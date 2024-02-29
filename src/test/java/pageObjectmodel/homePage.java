package pageObjectmodel;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ExcelUtilis.UtilisFile;

public class homePage extends BasePage
{      List<String> price=new ArrayList<String>();
       List<String> name=new ArrayList<String>();
 
    public homePage(WebDriver driver)
    {
    	
		   super(driver);
    }
    
    @FindBy(xpath="//input[@id=\"search\"]")
    WebElement Search_BookShelves;
    public void SearchBookshelves()
    {
    	Search_BookShelves.sendKeys("Bookshelves");
    }
    
    @FindBy(id="search_button")
    WebElement Click_Search;
    public void Clicksearch()
    {
    	Click_Search.click();
    }
    
    @FindBy(xpath="//*[@id='authentication_popup']/div/div/div[2]/a[1]")
    WebElement Close_popup;
    public void Closepopup()
    {
    	Close_popup.click();
    }
    
   
    @FindBy(xpath="//div[@class=\"gname\"]")
    WebElement open_category;
    public void Opencategory()
    {
    	  Actions actions = new Actions(driver);
	      actions.moveToElement(open_category).perform();
    }
    @FindBy(xpath="//*[@type=\"checkbox\"][1]")
    WebElement Click_Bookshelves;
    public void Clickbookshelves()
    {
    	Click_Bookshelves.click();
    }
    @FindBy(xpath="(//div[@class=\"gname\"])[2]")
    WebElement Click_price;
    public void Clickprice()
    {
    	Click_price.click();
    }
    
    @FindBy(xpath="//div[@class=\"noUi-handle noUi-handle-upper\"]")
    WebElement DragPrice_Slider;
    public void Dragpriceslider()
    {
    	  Actions move = new Actions(driver);
		  move.dragAndDropBy(DragPrice_Slider, -211, 50).build().perform();
    }
    
    @FindBy(xpath="(//*[@class=\"name \"])[7]")
    WebElement Click_Excludeoutofstock;
    public void ClickExcludeoutofstock()
    {
    	 Click_Excludeoutofstock.click();
    }
    
    @FindBy(xpath="//div[@class=\"gname\"]/span")
    WebElement Click_Recommended;
    public void Clickrecommended()
    {
    	  Actions actions = new Actions(driver);
	      actions.moveToElement(Click_Recommended ).perform();
    }
    @FindBy(xpath="(//*[@class=\"option\"])[3]")
    WebElement Select_price_priority;
    public void Selectprice()
    {    
    	Select_price_priority.click();
    }
    
    @FindBy(xpath="(//div[@class='product-title product-title-sofa-mattresses']/span)")
    List<WebElement> Collect_Items_Names;
    public void Collectitemnames() throws FileNotFoundException
    {
    	for(int i=1;i<4;i++) {
	     	 String Name=Collect_Items_Names.get(i).getText();
	     	 name.add(Name);
	     	 }
	        System.out.println(name);
	        
    }
    
    @FindBy(xpath="(//div[@class='price-number']//span)")
    List<WebElement> Collect_Items_Prices;
    public void Collectitemsprices() throws FileNotFoundException
    {
    	for(int j=1;j<4;j++) {
	     	
	     	 String Price=Collect_Items_Prices.get(j).getText();
	     	 price.add(Price);
	     	 }
	        System.out.println(price);
	        UtilisFile.saveDataToExcel(name, price);
    }
}
