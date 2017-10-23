package com.stepDefinations;
import java.util.List;

import com.runner.AbstractMain;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;

public class CommonStepDef extends AbstractMain {
	@And("^I search with valid product name \"([^\"]*)\"$")
	public void i_search_with_valid_product_name_something(String productName) throws Throwable {
		commonPage.searchWithProduct(productName);
	}

	@And("^I select Guest checkout with user email \"([^\"]*)\"$")
    public void i_select_guest_checkout_with_user_email_something(String guestEmail) throws Throwable {
		commonPage.enterGuestEmail(guestEmail);
    }

	@And("^I select minicart to go Basketpage$")
	public void i_select_minicart_to_go_basketpage() throws Throwable {
		commonPage.selectMiniCart();
	}
	
	 @And("^I enter Enter valid userName and password$")
	    public void i_enter_enter_valid_username_and_password(DataTable table) throws Throwable {
		 List<List<String>> data = table.raw();
			String userName=data.get(0).get(1);
		      String password=data.get(1).get(1); 
		      commonPage.enterLogInUSerDetails(userName, password);
	    }

}
