package com.pages;

import org.openqa.selenium.By;

import com.runner.AbstractMain;

public class HomePage extends AbstractMain{
	private static By TOP_NAV_CAT=By.cssSelector(".brands-menu");
	private static By TOP_NAV_SUB_CAT=By.cssSelector(".sprite-brand-0");
	
	public void selectSubCategoryFromTopNav(){
		driver.findElement(TOP_NAV_CAT).click();
		driver.findElement(TOP_NAV_SUB_CAT).click();
	}

}
