package com.stepDefinations;

import com.runner.AbstractMain;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


public class BasketSummaryStepDef extends AbstractMain{
	@And("^I select checkout Login button$")
	public void i_select_checkout_login_button() throws Throwable {
		basketSummaryPage.selectCheckout();
	}
	@Given("^I am in Basket page with one product$")
    public void i_am_in_basket_page_with_one_product() throws Throwable {
        
    }

}
