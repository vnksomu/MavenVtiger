package com.vtiger.TestScripts;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.generucLib.BaseClass;
import com.vtiger.generucLib.DataUtility;

public class CreateProductTest extends BaseClass{
	@Test
	public void createProduct() throws IOException
	{
		System.out.println("---crate product starts---");
		DataUtility du=new DataUtility();
		String orgName=du.getDataFromExcel("ProductData", 0, 1);
		Random r= new Random();
	    int num=r.nextInt();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.cssSelector("img[title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(orgName+num);
		driver.findElement(By.cssSelector("input[value='  Save  ']")).click();
		System.out.println("-----Create product ends------");
	}

}
