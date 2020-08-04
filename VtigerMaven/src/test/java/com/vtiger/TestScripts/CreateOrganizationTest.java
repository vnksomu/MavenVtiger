package com.vtiger.TestScripts;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generucLib.BaseClass;
import com.vtiger.generucLib.DataUtility;

@Listeners(com.vtiger.generucLib.ListenerFuctionality.class)
public class CreateOrganizationTest extends BaseClass {
	
	@Test
	public void createOrganizationTest() throws IOException
	{
		DataUtility du=new DataUtility();
		String orgName=du.getDataFromExcel("OrganizationData", 0, 1);
		Random r= new Random();
	    int num=r.nextInt();
		System.out.println("-----Create Organiztion Stats------");
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName+num);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		String msg = driver.findElement(By.xpath("//span[contains(text(),'Organization Information')]")).getText();
		String actmsg=orgName+num;
		System.out.println("msg :"+msg);
		System.out.println("actmsg :"+actmsg);
		if(msg.contains(actmsg))
		{
			System.out.println("organization created successfully");
		}
		else
		{
			System.out.println("organization creation failed");
		} 

}
}