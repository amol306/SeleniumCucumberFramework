package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MyPageFactory.HomePage_PF;
import MyPageFactory.LoginPage_PF;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_PF {
	WebDriver driver;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("PF browser is open")
	public void browser_is_open() {
		System.out.println("Inside PF Step : browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("PF user is on Login page")
	public void user_is_on_login_page() {
		System.out.println("Inside PF Step : user is on Login page");
		driver.get("https://example.testproject.io/web/");
		login = new LoginPage_PF(driver);
	}

	@When("^PF user enters (.*) & (.*)$")
	public void user_enters(String username, String password) {
		System.out.println("Inside PF Step : user enters username & password");

		login.enterusername(username);
		login.enterpassword(password);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("PF user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Inside PF Step : user clicks on login button");
		login.clicklogin();
	}

	@Then("PF user navigated to Home page")
	public void user_navigated_to_home_page() {
		System.out.println("Inside PF Step : user navigated to Home page");
		home = new HomePage_PF(driver);
		home.checklogout();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.close();
		// driver.quit();
	}
}
