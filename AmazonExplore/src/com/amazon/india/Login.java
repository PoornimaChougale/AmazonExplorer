package com.amazon.india;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//a[@class='nav-action-button']//span[contains(text(),'Sign in')][@class='nav-action-inner'])")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9901587308");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Poornima1@");
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
	
	
	
	}
}