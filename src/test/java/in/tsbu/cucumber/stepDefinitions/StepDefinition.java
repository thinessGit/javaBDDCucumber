package in.tsbu.cucumber.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static in.tsbu.utils.AppVariables.appDriver;
import static org.junit.Assert.assertTrue;

public class StepDefinition {

    @Given("user lands on the home page")
    public void user_lands_on_the_home_page() {
        appDriver.driver.get("https://www.google.com/");
    }

    @When("page title is Google")
    public void page_title_is_google() {
        System.out.println(appDriver.driver.getTitle());
    }

    @Then("enter search string {string}")
    public void enter_search_string(String searchText) throws InterruptedException {
        System.out.println("search on Google :" + searchText);
        appDriver.driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchText);
        appDriver.driver.findElement(By.xpath("//input[@name='btnK']")).click();
        Thread.sleep(1000);
        assertTrue(appDriver.driver.findElement(By.xpath("//input[@name='q']")).getAttribute("value").equalsIgnoreCase(searchText));
    }
}
