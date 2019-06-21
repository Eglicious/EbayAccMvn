package AutomationFrameWork.PracticeProjectMvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EbayMvnCreatAccHBegin {

WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"gh-p-3\"]/a")
	WebElement helpNContactMenuLink;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"register\"]")
	WebElement registerAccLink;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"firstname\"]")
	WebElement fNameInput;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"lastname\"]")
	WebElement lNameInput;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"email\"]")
	WebElement emailInput;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"PASSWORD\"]")
	WebElement passInput;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"ppaFormSbtBtn\"]")
	WebElement createAccButton;
	
	public EbayMvnCreatAccHBegin(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void createAccFromHelp(String fname, String lname, String emailin, String pass) {
		helpNContactMenuLink.click();
		registerAccLink.click();
		fNameInput.clear();
		fNameInput.sendKeys(fname);
		lNameInput.clear();
		lNameInput.sendKeys(lname);
		emailInput.clear();
		emailInput.sendKeys(emailin);
		passInput.clear();
		passInput.sendKeys(pass);
		createAccButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}
}
