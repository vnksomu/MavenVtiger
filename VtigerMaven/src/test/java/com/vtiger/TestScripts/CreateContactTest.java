package com.vtiger.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.generucLib.BaseClass;
import com.vtiger.generucLib.DataUtility;

public class CreateContactTest extends BaseClass {
	
	@Test
	public void createContact() throws IOException
	{
		System.out.println("----Create contact Start----");
		DataUtility du=new DataUtility();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(du.getDataFromExcel("ContactData",0,1));
		driver.findElement(By.cssSelector("input[value='  Save  ']")).click();
		System.out.println("----Create contact ended----");
		
	}

}
