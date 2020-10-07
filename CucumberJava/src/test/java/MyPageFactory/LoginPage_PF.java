package MyPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage_PF {
	WebDriver driver;

	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;

		// PageFactory.initElements(driver, this);

		AjaxElementLocatorFactory ajaxfactory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajaxfactory, this);
	}

	@FindBy(id = "name")
	@CacheLookup
	WebElement txtusername;

	@FindBy(id = "password")
	WebElement txtpassword;

	@FindBy(id = "login")
	WebElement btnlogin;
	
	@FindBy(partialLinkText="test")
	List<WebElement> myLinks;

	public void enterusername(String username) {
		txtusername.sendKeys(username);
	}

	public void enterpassword(String password) {
		txtpassword.sendKeys(password);
	}

	public void clicklogin() {
		btnlogin.click();
	}
}
