package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user in TalentTek homepage")
    public void userInTalentTekHomepage() {
        //verify page title
        //all java, selenium code stays here
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
    }

    @When("user clicks on Log In button")
    public void userClicksOnLogInButton() {
    }

    @Then("user should be able to log in successfully")
    public void userShouldBeAbleToLogInSuccessfully() {
    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() {
    }

    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String arg0) {
    }

    @And("user enter invalid email address")
    public void userEnterInvalidEmailAddress() {
    }

}