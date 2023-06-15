package org.qualitythought;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RamanasoftLogin {
	public static void main(String[]args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		String driverpath=System.setProperty("webdriver.chrome.driver","C:\\Users\\manim\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://ramanasoft1-001-site1.ftempurl.com/Admin");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("adminadmin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
