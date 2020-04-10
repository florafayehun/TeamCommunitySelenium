package bindings;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommunityCreate {

    WebDriver driver;

    @Given("^A registered user is logged into Giftrete website$")
    public void a_registered_user_is_logged_into_Giftrete_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://qa1.giftrt.com/");
        driver.manage().window().maximize();
    }

    @When("^A registered user clicks on Community tab$")
    public void a_registered_user_clicks_on_Community_tab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("a[href=\"/account/authentication?ref=1\"]")).click();
        driver.findElement(By.id("user_email")).sendKeys("flora.fayehun@yahoo.com");
        driver.findElement(By.id("user_password")).sendKeys("jason123");
        driver.findElement(By.id("btn_signin")).click();
        driver.findElement(By.cssSelector("a[href=\"/community\"]")).click();
    }

    @When("^The user clicks on the discover menu$")
    public void the_user_clicks_on_the_discover_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user selects a category \"([^\"]*)\"$")
    public void the_user_selects_a_category(String category) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.id("group_type_id")).sendKeys(category);
    }

    @When("^The user enters location Address \"([^\"]*)\" in the location address field$")
    public void the_user_enters_location_Address_in_the_location_address_field(String location) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();location
        driver.findElement(By.name("location")).sendKeys(location);
    }

    @When("^a user clicks on search button$")
    public void a_user_clicks_on_search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();button.searchform__submit:nth-child(1) > i:nth-child(1)
        driver.findElement(By.cssSelector("button.searchform__submit:nth-child(1) > i:nth-child(1)")).click();
    }

    @Then("^The existing communities should be displayed based on the search criteria$")
    public void the_existing_communities_should_be_displayed_based_on_the_search_criteria() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
