package bindings;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {

    WebDriver driver;

    @Given("^that a user navigate to Giftete website$")
    public void that_a_user_navigate_to_Giftete_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://qa1.giftrt.com/");
        driver.manage().window().maximize();
    }

    @When("^the user clicks on register button$")
    public void the_user_clicks_on_register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  a[href="/account/authentication?ref=2"]

        driver.findElement(By.cssSelector("a[href=\"/account/authentication?ref=2\"]")).click();
    }

    @When("^fill the firstname$")
    public void fill_the_firstname() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user should be successfully registered$")

    public void the_user_should_be_successfully_registered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
