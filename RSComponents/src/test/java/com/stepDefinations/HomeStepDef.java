package com.stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import com.runner.AbstractMain;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;


public class HomeStepDef extends AbstractMain{
	private static String BASEURL="https://uk.rs-online.com/web/";
	@Before
	public void start(){
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(BASEURL);
		driver.manage().window().maximize();
	}
	
	@Given("^I am in HomePage$")
	public void i_am_in_HomePage() throws Throwable {
		Assert.assertEquals("RS Components | Electronic and Electrical Components", driver.getTitle());
	}
	@After
	public void close(){
		driver.close();
	}
	@And("^I select brand from all brands$")
    public void i_select_brand_from_all_brands() throws Throwable {
		homePage.selectSubCategoryFromTopNav();
      
    }

}
