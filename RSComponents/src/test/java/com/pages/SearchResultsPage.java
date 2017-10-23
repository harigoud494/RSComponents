package com.pages;

import org.openqa.selenium.By;

import com.runner.AbstractMain;

public class SearchResultsPage extends AbstractMain{
	By GOTOPRODUCTS_BUTTON=By.cssSelector(".cssButton.secondary.blue");
	By ADD_BUTTON=By.cssSelector(".cartButton");
	public void addProductToBasket() throws InterruptedException{
	driver.findElement(GOTOPRODUCTS_BUTTON).click();
	Thread.sleep(2000);
	driver.findElements(ADD_BUTTON).get(0).click();
	
	}

}
