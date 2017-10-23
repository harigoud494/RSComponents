package com.stepDefinations;
import com.runner.AbstractMain;

import cucumber.api.java.en.Given;

public class SearchResultsStepDef extends AbstractMain{
	
	
	@Given("^I Add product from search results page$")
	public void i_Add_product_from_search_results_page() throws Throwable {
	searchResultsPage.addProductToBasket();
	  
	}

}
