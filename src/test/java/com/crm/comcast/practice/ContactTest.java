package com.crm.comcast.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContactTest {
@Test(groups ="ST")
public void createContact() {
	System.out.println("contact created");
//	String browser = System.getProperty("Browser");
//	String url = System.getProperty("URL");
//	String user = System.getProperty("UNAME");
//	String pwd = System.getProperty("PWD");
//	WebDriver driver = null;
//	if(browser.contains("chrome")) {
//		driver = new ChromeDriver();
//	}
//	else if(browser.contains("chrome")) {
//		driver = new FirefoxDriver();
//	}
//	else
//		driver =new ChromeDriver();
//	driver.get(url);
//	System.out.println("title:"+driver.getTitle());
//	driver.close();
}

@Test(groups = "IT")
public void executeContactTest() {
	System.out.println("execute conact");
}
}
