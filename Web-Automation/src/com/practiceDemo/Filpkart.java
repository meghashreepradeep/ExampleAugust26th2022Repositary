package com.practiceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpkart {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LunchApp();
		 navigate();
		 cancel();
		 mousemovement();
		 close();

	}
	private static void LunchApp()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Libraray\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void cancel()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void mousemovement()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			WebElement Obj=oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"));
			Actions omu=new Actions(oBrowser);
			omu.moveToElement(Obj).build().perform();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Smart Headphones")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Flights")).click();
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		oBrowser.quit();
	}

}
