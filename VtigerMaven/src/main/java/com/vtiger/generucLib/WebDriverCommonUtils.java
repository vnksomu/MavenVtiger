package com.vtiger.generucLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonUtils {
	public void waitForElement(WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void selectItemFromList(WebElement element, String elementTobeSelected)
	{
		Select s=new Select(element);
		s.selectByVisibleText(elementTobeSelected);
	}
	public boolean checkMultipleSelectList(WebElement element)
	{
		Select s=new Select(element);
		return s.isMultiple();
	}
	public void keepMouseOnElement(WebElement element)
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	public void moveObjectAtRequiredPlace(WebElement source,WebElement target)
	{
		Actions act=new Actions(BaseClass.driver);
		act.dragAndDrop(source, target).perform();
	}

}
