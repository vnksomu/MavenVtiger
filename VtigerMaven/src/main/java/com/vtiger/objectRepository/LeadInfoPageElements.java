package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadInfoPageElements {
	@FindBy (xpath="//span[contains(text(),'Lead Information')]")
	private WebElement successMessage;
	
	public WebElement getSuccessMessage()
	{
		return successMessage;
		
	}

}
