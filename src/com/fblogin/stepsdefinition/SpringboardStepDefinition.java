package com.fblogin.stepsdefinition;

import com.fblogin.tests.init.Init;
import com.fblogin.tests.testcases.TestCases;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SpringboardStepDefinition {

    @Given("^I am on the Google $")
    public void i_am_on_the_Springboard_Github_page_on_URL() throws Throwable {
        Init.initProperties();
    }

    @And("^I fill in automation$")
    public void i_fill_in_automation() throws Throwable {
        TestCases.searchField();
    }

    @And("^I click the search button$")
    public void i_click_the_search_button() throws Throwable {
        TestCases.searchButton();
    }

}
