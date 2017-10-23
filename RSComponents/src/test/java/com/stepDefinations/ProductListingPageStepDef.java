package com.stepDefinations;

import org.junit.Assert;

import com.runner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ProductListingPageStepDef extends AbstractMain{
	@When("^I filter with \"([^\"]*)\" facet$")
	public void i_filter_with_something_facet(String facetType) throws Throwable {
		productListingPage.selectFilter(facetType);
		
		

	}

	@Then("^I should see all filter results$")
	public void i_should_see_all_filter_results() throws Throwable {
		
		Assert.assertTrue("Facet Not Selected", productListingPage.isFacetSelected());
	}

}
