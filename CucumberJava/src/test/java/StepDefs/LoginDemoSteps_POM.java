package StepDefs;

import Pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_POM {
	WebDriver driver;
	LoginPage login;

	@Given("POM browser is open")
	public void browser_is_open() {
		System.out.println("Inside POM Step : browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("POM user is on Login page")
	public void user_is_on_login_page() {
		System.out.println("Inside POM Step : user is on Login page");
		driver.get("https://example.testproject.io/web/");
		login = new LoginPage(driver);
	}

	@When("^POM user enters (.*) & (.*)$")
	public void user_enters(String username, String password) {
		System.out.println("Inside POM Step : user enters username & password");

		login.enterUsername(username);
		login.enterPassword(password);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("POM user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Inside POM Step : user clicks on login button");
		login.clickLogin();
	}

	@Then("POM user navigated to Home page")
	public void user_navigated_to_home_page() {
		System.out.println("Inside POM Step : user navigated to Home page");
		login.checkLogout();
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
