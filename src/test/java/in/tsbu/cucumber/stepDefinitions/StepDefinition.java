package in.tsbu.cucumber.stepDefinitions;

import in.tsbu.selenium.WebAppDriver;
import in.tsbu.utils.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class StepDefinition {

    WebAppDriver appDriver = new WebAppDriver();
    private final WebDriver driver = appDriver.initDriver();

    @Given("user lands on the Google home page")
    public void user_lands_on_the_home_page() {
        driver.get("https://www.google.com/");
        Log.info("Loading google.com in browser");
    }

    @When("page title is Google")
    public void page_title_is_google() {
        Log.info("Title" + Log.COLON + driver.getTitle());
    }

    @Then("enter search string {string}")
    public void enter_search_string(String searchText) {
        System.out.println("search on Google :" + searchText);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchText);
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
        assertTrue(Log.ARROW_RIGHT + " Verification failed: " + searchText + " not same " + Log.ARROW_LEFT, driver.findElement(By.xpath("//input[@name='q']")).getAttribute("value").equalsIgnoreCase(searchText));
        Log.info("Search Text" + Log.COLON + searchText);
        driver.quit();
    }

    @Given("user lands on the Bing home page")
    public void user_lands_on_the_bing_home_page() {
        driver.get("https://www.bing.com/");
        Log.info("Loading bing.com");
    }

    @When("page title is Bing")
    public void page_title_is_bing() {
        Log.info("Title" + Log.COLON + driver.getTitle());
    }

    @Then("enter search string {string} on Bing")
    public void enter_search_string_on_bing(String searchText) {
        System.out.println("search on Bing :" + searchText);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchText);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        assertTrue(Log.ARROW_RIGHT + " Verification failed: " + searchText + " not same " + Log.ARROW_LEFT, driver.findElement(By.xpath("//input[@name='q']")).getAttribute("value").equalsIgnoreCase(searchText));
        Log.info("Search Text" + Log.COLON + searchText);
        driver.quit();
    }
}
