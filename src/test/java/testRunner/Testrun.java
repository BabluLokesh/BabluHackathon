package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//Features/A_OpenBookshelves.feature",
				".//Features/B_livingPage.feature",".//Features/C_giftcardvalidation.feature"},
		glue= "stepDefinition",
		plugin= {"pretty","html:reports//myreport.html",
				"json:reports/myreport.json"		
		}
		//dryRun=false,
		//monochrome=true,
		//tags="@Smoke"	
		)
		
public class Testrun {

}