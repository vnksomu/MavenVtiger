package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElement {
	@FindBy(name="user_name")
	private WebElement userName;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	
	public WebElement getUserName()
	{
		return userName;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLoginButton()
	{
		return loginButton;
	}
   
	public void loginToApp(String un,String psw)
	{
		userName.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
	}
}
