package com.practiceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lunchbrowser();
		navigation();
		search();
		CloseApplication();

	}
	private static void lunchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Libraray\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigation()
	{
		try
		{
			oBrowser.get("https://www.youtube.com");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void search()
	{
		try
		{
			oBrowser.findElement(By.name("search_query")).sendKeys("new songs");
			oBrowser.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CloseApplication()
	{
		oBrowser.quit();
	}
	
	}


