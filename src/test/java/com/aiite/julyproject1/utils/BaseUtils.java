package com.aiite.julyproject1.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseUtils {

	public WebDriver driver = null;
	
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void initDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/msedgedriver.exe");
			driver = new EdgeDriver(); 
		}
		driver.manage().window().maximize();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void clickElement(By element) {
		driver.findElement(element).click();
	}
	public String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void inputText(WebElement element, String input) {
		element.sendKeys(input);
	}
	public void inputText(WebElement element, Keys key) {
		element.sendKeys(key);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	public void teardown() {
		driver.close();
	}
	public String screenshot(WebDriver driver) {
		TakesScreenshot take = (TakesScreenshot)driver;
		String src = take.getScreenshotAs(OutputType.BASE64);
		return src;
	}
}
