package pageObjectmodel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

     public class ScrollToElement extends BasePage{
    	 
	JavascriptExecutor js;
     public ScrollToElement(WebDriver driver){
	   
	   super(driver);
	   js = (JavascriptExecutor)driver;
	
     }
     
    public void scroll(WebElement ele)
 	{
 		js = (JavascriptExecutor)driver;
 		js.executeScript("arguments [0].scrollIntoView();",ele);
 	}
     
     
}
