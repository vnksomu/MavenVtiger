package com.vtiger.TestScripts;

import java.io.IOException;


import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generucLib.BaseClass;
import com.vtiger.generucLib.DataUtility;
import com.vtiger.objectRepository.CreateNewLeadPageElement;
import com.vtiger.objectRepository.HomePageElement;
import com.vtiger.objectRepository.LeadInfoPageElements;
import com.vtiger.objectRepository.LeadPageElement;
@Listeners(com.vtiger.generucLib.ListenerFuctionality.class)
public class CreateLeadTest extends BaseClass{

	@Test
	public void createLead() throws IOException {
		DataUtility du=new DataUtility();
		HomePageElement hp=PageFactory.initElements(driver, HomePageElement.class);
		LeadPageElement lp=PageFactory.initElements(driver, LeadPageElement.class);
		CreateNewLeadPageElement clp=PageFactory.initElements(driver, CreateNewLeadPageElement.class);
		LeadInfoPageElements lip=PageFactory.initElements(driver, LeadInfoPageElements.class);
		hp.getLeads().click();
		lp.getCreateLeadButton().click();
		clp.getLastName().sendKeys(du.getDataFromExcel("LeadData", 0, 1));
		clp.getCompany().sendKeys(du.getDataFromExcel("LeadData", 1, 1));
		clp.getSaveButton().click();
		String actLeadMsg=lip.getSuccessMessage().getText();
		Assert.assertTrue(actLeadMsg.contains(du.getDataFromExcel("LeadData", 2, 1)));
		System.out.println("Create Lead Successfull");
}


}










