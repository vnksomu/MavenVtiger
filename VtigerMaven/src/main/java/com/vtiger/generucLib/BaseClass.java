package com.vtiger.generucLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.objectRepository.HomePageElement;
import com.vtiger.objectRepository.LoginPageElement;

public class BaseClass {
	public static WebDriver driver;
	DataUtility data=new DataUtility();
	@BeforeSuite
	public void configBS()//before suite
	{
		System.out.println("---=Database connct=----");
	}
	@BeforeClass
	public void configBC() throws IOException
	{
		System.out.println("-----------Browser Launching starts------------");
		String browser = data.getDataFromProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(data.getDataFromProperty("url"));
		System.out.println("-----------Browser Launching ends------------");
	}
	@BeforeMethod
	public void configBM() throws IOException
	{
		System.out.println("-----login starts------");
	LoginPageElement login=PageFactory.initElements(driver, LoginPageElement.class);
			login.loginToApp(data.getDataFromProperty("username"), data.getDataFromProperty("password"));
		System.out.println("-----login ends------");
	}

    @AfterMethod
	public void configAM() throws InterruptedException
	{
	   System.out.println("------logout starts---------");
	HomePageElement hp=PageFactory.initElements(driver,HomePageElement.class);
	hp.logoutFromApp();
	   System.out.println("----logout ends------");
	}
	
	@AfterClass
	public void configAC()//before suite
	{
		System.out.println("---=Browser closed------");
	}
	
	
	@AfterSuite
	public void configAs()//before suite
	{
		System.out.println("---=Database disconnect---");
	}
}
