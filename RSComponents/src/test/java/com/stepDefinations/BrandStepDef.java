package com.stepDefinations;

import com.runner.AbstractMain;

import cucumber.api.java.en.And;

public class BrandStepDef extends AbstractMain{
	
	@And("^I select category from brand page$")
	public void i_select_category_from_brand_page() throws Throwable {
		brandPage.selectPopularCat();
	}

}
