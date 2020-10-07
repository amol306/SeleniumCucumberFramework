package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step : browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("user is on Login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step : user is on Login page");
		driver.get("https://example.testproject.io/web/");

	}

	@When("user enters username & password")
	public void user_enters_username_password() {
		System.out.println("Inside Step : user enters username & password");
		System.out.println("Page Title : " + driver.getTitle());
		driver.findElement(By.id("name")).sendKeys("Amol");
		driver.findElement(By.id("password")).sendKeys("12345");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user enters {string} & {string}")
	public void user_enters(String username, String password) {
		System.out.println("Inside Step : user enters username & password");
		System.out.println("Page Title : " + driver.getTitle());
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user enter invalid credentials {string} & {string}")
	public void user_enter_invalid_credentials(String username, String password) {
		System.out.println("Inside Step : user enters invalid credential username & password");
		System.out.println("Page Title : " + driver.getTitle());
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Inside Step : user clicks on login button");
		driver.findElement(By.id("login")).click();
	}

	@Then("user navigated to Home page")
	public void user_navigated_to_home_page() {
		System.out.println("Inside Step : user navigated to Home page");
		driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("Page Title : " + driver.getTitle());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.close();
		// driver.quit();
	}

	@Then("user get invalid credentials message")
	public void user_get_invalid_credentials_message() {
		System.out.println("Inside Step : user get invalid credentials message");
		System.out.println("Page Title : " + driver.getTitle());
		driver.findElement(By.xpath("//div[contains(text(),'Password is invalid')]")).isDisplayed();
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
