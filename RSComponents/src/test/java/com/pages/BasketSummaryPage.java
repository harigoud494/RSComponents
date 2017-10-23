package com.pages;

import org.openqa.selenium.By;

import com.runner.AbstractMain;

public class BasketSummaryPage extends AbstractMain{
	private static By CHECKOUT_BUTTON=By.cssSelector(".toggleBtnState a");
	public void selectCheckout(){
		driver.findElements(CHECKOUT_BUTTON).get(0).click();
		
	}

}
