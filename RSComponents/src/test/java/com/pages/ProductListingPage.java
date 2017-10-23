package com.pages;

import org.openqa.selenium.By;

import com.runner.AbstractMain;

public class ProductListingPage extends AbstractMain {
	public static By FILTER_TYPE = By.cssSelector(".filter");
	public static By SELECTED_FACET_TYPE = By.cssSelector(".appliedAttribute");
	public static By FACET_TYPE = By.cssSelector(".ng-pristine");
	public static By APPLY_FILTERS_BUTTON = By.cssSelector(".matches-btn.active");
	

	public void selectFilter(String filterType) throws InterruptedException {
		if (filterType.equalsIgnoreCase("Brand")) {
			driver.findElements(FILTER_TYPE).get(0).click();
			driver.findElements(FACET_TYPE).get(0).click();
		}
		else if(filterType.equalsIgnoreCase("Range")){
			driver.findElements(FILTER_TYPE).get(1).click();
			driver.findElements(FACET_TYPE).get(2).click();
		}
		else if(filterType.equalsIgnoreCase("Series")){
			driver.findElements(FILTER_TYPE).get(2).click();
			driver.findElements(FACET_TYPE).get(2).click();
		}
		
		
		driver.findElements(APPLY_FILTERS_BUTTON).get(1).click();
		
		Thread.sleep(2000);
		

	}
	public boolean isFacetSelected(){
		return driver.findElement(SELECTED_FACET_TYPE).isDisplayed();
		
	}

}
