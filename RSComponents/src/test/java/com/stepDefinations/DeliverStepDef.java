package com.stepDefinations;

import java.util.List;

import com.runner.AbstractMain;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class DeliverStepDef extends AbstractMain{
	@When("^I enter Delivery details and click on continue to payment$")
	public void i_enter_Delivery_details(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		String userType=data.get(0).get(1);
	      String title=data.get(1).get(1); 
	      String firstName=data.get(2).get(1); 
	      String lastName=data.get(3).get(1); 
	      String mobleNumber=data.get(4).get(1); 
	      String companyOrYourName=data.get(5).get(1); 
	      String addressLine1=data.get(6).get(1); 
	      String town=data.get(7).get(1); 
	      String postCode=data.get(8).get(1); 
	    deliveryPage.deliveryInformation(userType,title,firstName,lastName,mobleNumber,companyOrYourName,addressLine1,town,postCode);  
	    
	}

}
