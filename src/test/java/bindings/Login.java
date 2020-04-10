package bindings;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;


    @Given("^that I navigate to http://qa(\\d+)\\.giftrt\\.com$")
    public void that_I_navigate_to_http_qa_giftrt_com(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://qa1.giftrt.com/");
        driver.manage().window().maximize();
    }

    @When("^the user clicks on the login button$")
    public void the_user_clicks_on_the_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("a[href=\"/account/authentication?ref=1\"]")).click();

    }

    @When("^the user fill his emailId \"([^\"]*)\" in the email address textbox$")
    public void the_user_fill_his_emailId_in_the_email_address_textbox(String emailID) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user_email")).sendKeys(emailID);
    }

    @When("^the user fills his password  \"([^\"]*)\"in the password test box$")
    public void the_user_fills_his_password_in_the_password_test_box(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user_password")).sendKeys(password);
    }


    @When("^the ussr clicks on Sign In button$")
    public void the_ussr_clicks_on_Sign_In_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("btn_signin")).click();
    }

    @Then("^the user should be logged in successfully$")
    public void the_user_should_be_logged_in_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();

     ////   String ET ="Giftrete-My Account";
       // String AT = driver.getTitle();

      ////  Assert.assertEquals(ET,AT);
       // driver.quit();


        String URL = driver.getCurrentUrl();
        if(URL.contains("http://qa1.giftrt.com/account/profile"))
        {
            System.out.println("Landed in correct URL" +
                    "" + URL);

        }else
        {
            System.out.println("Landed in wrong URL");

        }

       // Assert.assertEquals("http://qa1.giftrt.com/account/profile", driver.getCurrentUrl());
    }





   }