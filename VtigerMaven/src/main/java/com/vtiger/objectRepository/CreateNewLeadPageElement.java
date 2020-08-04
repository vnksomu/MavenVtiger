package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewLeadPageElement {
	@FindBy(name="lastname")
	private WebElement lastName;
	@FindBy(name="company")
	private WebElement company;
	@FindBy(css="input[value='  Save  ']")
	private WebElement saveButton;
	public WebElement getLastName()
	{
		return lastName;
	}
	public WebElement getCompany()
	{
		return company;
	}
	public WebElement getSaveButton()
	{
		return saveButton;
	}

}
