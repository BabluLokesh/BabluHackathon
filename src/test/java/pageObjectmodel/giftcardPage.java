package pageObjectmodel;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Factory.BaseClass;



//import ExcelUtilis.screenshots;
//import bookShelves.ScrollToElement;

public class giftcardPage extends BasePage
{
  
   JavascriptExecutor js;
   ScrollToElement sc;
  
  
  
  public giftcardPage(WebDriver driver)
  {
	  super(driver);
  }
  
  
  
  @FindBy(xpath="(//*[@class=\"_21JOl\"])[3]")
  WebElement Click_Anniversary;
  public void Clickanniversary()
  {
	  Click_Anniversary.click();
  }
  @FindBy(xpath="(//button[@class=\"HuPJS\"])[3]")
  WebElement Amount_Selection;
  public void Amountselection()
  {
	  Amount_Selection.click();
  }
  @FindBy(xpath="(//*[@class='Upz18 _1hLiD UJU2v'])[1]")
  WebElement Select_Month;
  public void SelectMonth()
  {
	  Select_Month.click();
  	Select dropdown = new Select(  Select_Month);
  	dropdown.selectByVisibleText("Mar (2024)");
  }
  
  @FindBy(xpath="(//*[@class='Upz18 _1hLiD UJU2v'])[2]")
  WebElement Select_Date;
  public void SelectDate()
  {
	 Select_Date.click();
  	Select date = new Select(Select_Date);
  	date.selectByVisibleText("21");
  }
  
  @FindBy(xpath="(//*[@type=\"button\"])[8]")
  WebElement Click_Next;
  public void ClickNext()
  {
 	 Click_Next.click();
  }
  @FindBy(xpath="(//input[@type=\"text\"])[3]")
  WebElement RecepeintName_txt;
  public void RecepientName()
  {
	  RecepeintName_txt.sendKeys("Baby");
  }
  @FindBy(xpath="(//input[@type=\"text\"])[4]")
  WebElement SenderName_txt;
  public void SenderName()
  {
	  SenderName_txt.sendKeys("Bablu");
  }
  
 
  
  @FindBy(xpath="(//input[@type=\"email\"])[1]")
  WebElement RecepientEmail_txt;
  public void RecepientEmail()
  {
	  RecepientEmail_txt.sendKeys("babybablu@gmail.com");
  }
  
  @FindBy(xpath="(//input[@type=\"email\"])[2]")
  WebElement SenderEmail_txt;
  public void SenderEmail()
  {
	  SenderEmail_txt.sendKeys("Sindhubablugmail.com");
  }
  
  @FindBy(xpath="//*[@id='ip_4081352456']")
  WebElement Error_Message;
  public void EroorMessage()
  {
	   String msg=Error_Message.getAttribute("validationMessage");
		System.out.println(msg);
  }
  
  
  @FindBy(xpath=("(//input[@type=\"tel\"])[1]"))
  WebElement RecepientNo_txt;
  public void RecepientNo()
  {
	  RecepientNo_txt.sendKeys("9999923456");
  }
  
  @FindBy(xpath=("(//input[@type=\"tel\"])[2]"))
  WebElement SenderNo_txt;
  public void SenderNo()
  {
	  SenderNo_txt.sendKeys("9999999999");
  }
  
  @FindBy(xpath="(//input[@type=\"text\"])[5]")
  WebElement Recepients_Address;
  public void RecepientsAddress()
  {
	  Recepients_Address.sendKeys("Central Texas MLS pst california");
  }
  @FindBy(xpath="(//input[@type=\"number\"])[2]")
  WebElement pincode;
  public void Pincode()
  {
	  pincode.sendKeys("600007");
  }
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement Click_confirm;
  public void Clickconfirm() throws IOException
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", Click_confirm);
	  screenshots.takeScreenshot(driver, "Invalid Email");
  }
  
  @FindBy(xpath="(//input[@type='email'])[2]")
  WebElement Valid_Sender;
  public void Validsender()
  {
	  Valid_Sender.sendKeys("Sindhubablu@gmail.com");
  }
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement Click_Confirm;
  public void clickconfirm() 
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", Click_Confirm);
  
  }
  
  @FindBy(xpath=("(//*[@class=\"_2sedU\"]"))
  WebElement Scroll_Heading;
  public void Scrollheading()
  {
	sc= new ScrollToElement(BaseClass.getDriver());
	sc.scroll(Scroll_Heading);
			
  }
  
  @FindBy(xpath=("(//*[@class=\"_FCNL\"])[1]"))
  WebElement scroll_heading;
  public void scrollheading()
  {
	sc= new ScrollToElement(driver);
	sc.scroll(scroll_heading);
  }
  
  public void refresh()
  {
	  driver.navigate().refresh();
  }
  
  public void Scrolltop()
  {
	  js.executeScript("window.scrollTo(0,0);");
  }
	  
  
}
