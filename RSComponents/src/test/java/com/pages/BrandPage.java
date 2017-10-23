package com.pages;

import org.openqa.selenium.By;

import com.runner.AbstractMain;

public class BrandPage extends AbstractMain{
	private static By POPULAT_CAT=By.cssSelector(".pc-brd-top");
	
	public void selectPopularCat(){
		driver.findElements(POPULAT_CAT).get(0).click();
	}

}
