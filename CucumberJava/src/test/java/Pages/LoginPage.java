package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;
	private By txtusername = By.id("name");
	private By txtpassword = By.id("password");
	private By btnlogin = By.id("login");
	private By btnLogout = By.id("logout");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("Page Title : " + driver.getTitle());
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("Login page not loaded! Current page title is : " + driver.getTitle());
		}
	}

	public void enterUsername(String username) {
		driver.findElement(txtusername).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txtpassword).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btnlogin).click();
	}

	public void checkLogout() {
		driver.findElement(btnLogout).isDisplayed();
	}
}
