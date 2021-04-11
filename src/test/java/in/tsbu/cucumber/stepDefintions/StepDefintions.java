package in.tsbu.cucumber.stepDefintions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintions {
    @Given("user lands on the home page")
    public void user_lands_on_the_home_page() {
        System.out.println("home page");
    }
    @When("page title is Google")
    public void page_title_is_google() {
        System.out.println("Google site");
    }
    @Then("enter search string {string}")
    public void enter_search_string(String searchText){
        System.out.println("search on Google :" + searchText);
    }
}
