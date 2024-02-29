package pageObjectmodel;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExcelUtilis.UtilisFile;

public class livingPage extends BasePage
{
	List<String> items=new ArrayList<String>();
	WebDriverWait wait;
	JavascriptExecutor js;
  //constructor
  public livingPage(WebDriver driver)
  {
	  super(driver);
	  wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	  js = (JavascriptExecutor)driver;
  }
  
  @FindBy(xpath="//*[@class=\"topnav_item livingunit\"]")
  WebElement Click_Living;
  public void Clickliving()
  {
	  Click_Living.click();
  }
  
  @FindBy(linkText="Seating & Chairs")
  WebElement Click_SeatingandChairs;
  public  void ClickSeatingandchairs()
  {
	  Actions actions = new Actions(driver);
      actions.moveToElement(Click_SeatingandChairs ).perform();
  }
  
  @FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[3]/div/div/ul/li[1]/ul/li/a/span")
 List<WebElement> Collect_Displayed_items;
  public void Collectdisplayeditems() throws IOException 
  {
	  for(int k=0;k<11;k++) {
	     	
	     	 String Items=Collect_Displayed_items.get(k).getText();
	     	 items.add(Items);
	     	 }
	        System.out.println(items);
	        UtilisFile.saveDataToExcel2(items);
	        UtilisFile.closeExcel();
  }
  
  @FindBy(xpath = "//a[text()=' Gift Cards ']")
  WebElement Go_to_giftcards;
  public void Gotogiftcard()
  {
	  js.executeScript("window.scrollTo(0,0);");
	  wait.until(ExpectedConditions.visibilityOf(Go_to_giftcards));
	  try {
		  Go_to_giftcards.click();
	  }
	  catch (TimeoutException e) {
	}
	  js.executeScript("window.scrollTo(0,300);");
  
  
  
}

	  @FindBy(xpath="//a[text()=' Gift Cards ']")
	  WebElement go_to_giftcrads;
	  public void gotogiftcard()
	  {
		  go_to_giftcrads.click();
	  }
	  
  }
  
  
  

