package com.section1;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Yatra {
	@Test
	public void yatrahandle() throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new  ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("booking_engine_buses")).click();
		driver.findElement(By.id("BE_bus_from_station")).click();
		Thread.sleep(2000);
		List<WebElement> wb=driver.findElements(By.xpath("//div[@class='viewport']//li"));
		for(WebElement w:wb)
		{
		String s=w.getText();
		if(s.equals("Bangalore"))
		{
			w.click();
			break;
		}
		}
		List<WebElement> wb1=driver.findElements(By.xpath("//div[@class='viewport']//li"));
		for(WebElement w1:wb1)
		{
		String s1=w1.getText();
		if(s1.equals("Chennai"))
		{
			w1.click();
			break;
		}
		}
		driver.findElement(By.id("BE_bus_depart_date")).click();
		driver.findElement(By.id("30/12/2022")).click();
		driver.findElement(By.id("BE_bus_search_btn")).click();
		String s=driver.findElement(By.cssSelector("h1.fbold")).getText();
		System.out.println(s);
		driver.close();
}
}


























