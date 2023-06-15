package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
	public static void main(String[]args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		String driverPath=System.setProperty("webdriver.chrome.driver","C:\\Users\\manim\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com//");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("7401273786");
		driver.findElement(By.name("pass")).sendKeys("Sithick0786");
		driver.findElement(By.name("login")).click();
		
		
	}
}
