package com.amazon.india;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.com");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//label[contains(text(),'Flexible With Date')]"));
		boolean b=ele.isDisplayed();
		if(b)
		{
			System.out.println("yes its displayed");
		}
		else
		{
			System.out.println("yes its not displayed");
		}
		
		

	}

}
