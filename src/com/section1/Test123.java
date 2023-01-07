package com.section1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test123 {
	@Test(dataProvider="dataSupplier")
	public  void ask(String name) {
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
	String msg=driver.findElement(By.id("result-stats")).getText();
	System.out.println(msg);
	driver.close();
}
	@DataProvider
	public Object[][] dataSupplier()
	{
		Object[][] objarr=new Object[4][1];
		objarr[0][0]="messi";
		objarr[1][0]="ronaldo";
		objarr[2][0]="neymar";
		objarr[3][0]="empape";
		return objarr;
	}
}