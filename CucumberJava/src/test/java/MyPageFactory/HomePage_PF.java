package MyPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class HomePage_PF {
	WebDriver driver;

	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "logout")
	WebElement btnlogout;

	public void checklogout() {
		btnlogout.isDisplayed();
	}

}
