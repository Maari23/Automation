package com.gitDemo.Grid;

import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test {
	
	@Test
	public void Checkin() throws MalformedURLException 
	{
		WebDriver d=new ChromeDriver();
	d.get("http://google.com");
	d.manage().window().maximize();
	d.close();
	System.out.println("test");
	
	}

}
