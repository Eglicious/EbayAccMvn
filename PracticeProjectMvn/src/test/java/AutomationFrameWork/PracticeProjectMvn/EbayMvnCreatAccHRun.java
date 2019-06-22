 package AutomationFrameWork.PracticeProjectMvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.com.ebay_account.Ebay_accountTest;

public class EbayMvnCreatAccHRun {


	
	@Test
	
	void run() {
		 WebDriver driver = BrowserFactory.openbrowser("chrome","https://www.ebay.com/");
		 EbayMvnCreatAccHBegin run = PageFactory.initElements(driver, EbayMvnCreatAccHBegin.class);
		run.createAccFromHelp("user1","userlast","emailuser@gmail.com","passuniodnew@1");
	
	
	}
	
	
	

}
