package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step- browser is open");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prisj/eclipse-workspace/CucumberDemo/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().window().maximize();
	}

	@And("user is on google serch page")
	public void user_is_on_google_serch_page() {
		System.out.println("Inside step- user is on google_page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search input")
	public void user_enters_a_text_in_search_input() {
		System.out.println("Inside step- user enters the text in search input");
		driver.findElement(By.id("APjFqb")).sendKeys("Cheese");
	}

	@When("user clicks enter key")
	public void user_clicks_enter_key() {
		System.out.println("Inside step- user clicks the enter key");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER );
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
		System.out.println("Inside step - user navigated to search results");
		driver.getTitle().contains("Cheese");
		driver.close();
		driver.quit();
	}

}
