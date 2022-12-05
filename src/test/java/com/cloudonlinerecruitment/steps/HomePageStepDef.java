package com.cloudonlinerecruitment.steps;

import com.cloudonlinerecruitment.page.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I Click on Home$")
    public void iClickOnHome() {
        new HomePage().clcikonHome();
    }

    @And("^I click on Vacancies$")
    public void iClickOnVacancies() {
        new HomePage().clcikonVacancies();
    }
//last test case I have intensely  fail
    @Then("^I click on My Account$")
    public void iClickOnMyAccount() {
        new HomePage().clcikonMyAccount();
    }
}
