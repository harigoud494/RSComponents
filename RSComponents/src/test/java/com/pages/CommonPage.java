package com.pages;

import org.openqa.selenium.By;

import com.runner.AbstractMain;

public class CommonPage extends AbstractMain{
	private static By SEARCH_TEXTBOX=By.cssSelector("#searchTerm");
	private static By SEARCH_BUTTON=By.cssSelector(".new-search-btn");
	private static By MINICART_BUTTON=By.cssSelector(".js-basket a");
	private static By GUEST_EMAIL_TEXTBOX=By.cssSelector(".emailAddress.inputText");
	private static By CHECKOUT_BUTTON=By.cssSelector(".redButton");
	private static By USERNAME=By.cssSelector(".username");
	private static By PASSWORD=By.cssSelector(".password");
	
	
	public void searchWithProduct(String productName){
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXTBOX).sendKeys(productName);
		driver.findElement(SEARCH_BUTTON).click();
		
	}
	public void selectMiniCart() throws InterruptedException{
		
		driver.findElement(MINICART_BUTTON).click();
		
		try{   
			   driver.switchTo().alert().dismiss();  
			  }catch(Exception e){ 
			   System.out.println("unexpected alert not present");   
			  }
		Thread.sleep(2000);
		
	}
	public void enterGuestEmail(String guestEmail) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(GUEST_EMAIL_TEXTBOX).clear();
		driver.findElement(GUEST_EMAIL_TEXTBOX).sendKeys(guestEmail);
		driver.findElements(CHECKOUT_BUTTON).get(1).click();
		Thread.sleep(4000);
		
		
	}
	public void enterLogInUSerDetails(String userName,String password) throws InterruptedException{
		driver.findElements(USERNAME).get(1).clear();
		driver.findElements(USERNAME).get(1).sendKeys(userName);
		driver.findElement(PASSWORD).clear();
		driver.findElement(PASSWORD).sendKeys(password);
		driver.findElements(CHECKOUT_BUTTON).get(0).click();
		Thread.sleep(5000);
		
	}
	

}
