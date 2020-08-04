package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPageElement {
	@FindBy(css="img[title='Create Lead...']")
	private WebElement createLeadButton;
	 public WebElement getCreateLeadButton()
	 {
		 return createLeadButton;
	 }

}
