package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.runner.AbstractMain;

public class DeliveryPage extends AbstractMain {
	public static By TITLE_DROPDOWN = By.cssSelector(".title.formInput");
	public static By FIRST_NAME = By.cssSelector(".firstName");
	public static By LAST_NAME = By.cssSelector(".surName");
	public static By MOBILE_NUMBER = By.cssSelector(".contactNumber");
	public static By COMPANY_YOUR_NAME = By.cssSelector(".companyNameOne");
	public static By ADDRESS_LINE1 = By.cssSelector(".addressLineOne");
	public static By TOWN = By.cssSelector(".textInput.inputText");
	public static By POSTCODE = By.cssSelector(".postCode");
	public static By CONTINUETOPAYMENT_BUTTON = By.cssSelector(".cssButton.primary.blue.enabledBtn");
	
	
	public void deliveryInformation(String userType,String title, String firstName, String lastName, String mobleNumber,
			String companyOrYourName, String addressLine1, String town, String postCode) throws InterruptedException {
		try{   
			   driver.switchTo().alert().dismiss();  
			  }catch(Exception e){ 
			   System.out.println("unexpected alert not present");   
			  }
		if(userType.equalsIgnoreCase("Guest")){
		Select titleDropDown = new Select(driver.findElement(TITLE_DROPDOWN));
		titleDropDown.selectByVisibleText(title);
		driver.findElement(FIRST_NAME).clear();
		driver.findElement(FIRST_NAME).sendKeys(firstName);
		driver.findElement(LAST_NAME).clear();
		driver.findElement(LAST_NAME).sendKeys(lastName);
		driver.findElement(MOBILE_NUMBER).clear();
		driver.findElement(MOBILE_NUMBER).sendKeys(mobleNumber);
		driver.findElements(TOWN).get(7).clear();
		driver.findElements(TOWN).get(7).sendKeys(town);
		}
		driver.findElement(COMPANY_YOUR_NAME).clear();
		driver.findElement(COMPANY_YOUR_NAME).sendKeys(companyOrYourName);
		driver.findElement(ADDRESS_LINE1).clear();
		driver.findElement(ADDRESS_LINE1).sendKeys(addressLine1);
		
		driver.findElements(TOWN).get(4).clear();
		driver.findElements(TOWN).get(4).sendKeys(town);
		driver.findElement(POSTCODE).clear();
		driver.findElement(POSTCODE).sendKeys(postCode);
		driver.findElements(CONTINUETOPAYMENT_BUTTON).get(1).click();
		Thread.sleep(2000);
		
		
	}

}
