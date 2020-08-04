package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.vtiger.generucLib.BaseClass;

public class HomePageElement {
	@FindBy(linkText="Leads")
	private WebElement Leads;
	@FindBy(linkText="Organizations")
	private WebElement Organizations;
	@FindBy(linkText="Contacts")
	private WebElement Contacts;
	@FindBy(linkText="Products")
	private WebElement Products;
	@FindBy(xpath = "//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement signoutDD;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;
	
	public WebElement getLeads()
	{
		return Leads;
	}
	public WebElement getOrganizations()
	{
		return Organizations;
	}
	public WebElement getContacts()
	{
		return Contacts;
	}
	public WebElement getProducts()
	{
		return Products;
	}
	public WebElement getSignOutDD()
	{
		return signoutDD;
	}
	public WebElement getSignoutLink()
	{
		return signoutLink;
	}
	
	public void logoutFromApp()
	{
		Actions act= new Actions(BaseClass.driver);
		
		act.moveToElement(signoutDD).perform();
		signoutLink.click();
	}
}









