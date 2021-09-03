package com.qa.priority_demo;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LetCode_input 
{
	WebDriver driver;
  @Test(priority = 1)
  public void test1()
  {
	driver.get("https://letcode.in/");
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='button is-white']")).click();
	driver.findElement(By.xpath("//button[@routerlink='/edit']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'button is-primary')]")).sendKeys("DESHAN");
	System.out.println("Test1 Passed!!!");
  }
  
	
	  @Test (priority = 2)
	  public void test2() { 
      driver.get("https://letcode.in/");
	  //driver.manage().window().maximize(); driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//button[@class='button is-white']")).click();
	  driver.findElement(By.xpath("//button[@routerlink='/edit']")).click();
	  driver.findElement(By.xpath("//input[@value='I am good']")).clear(); 
	  System.out.println("Test2 Passed!!!");
	  }
	  
	  @Test(priority = 3)
	  public void test3() 
	  {
		driver.get("https://letcode.in/");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='button is-white']")).click();
		driver.findElement(By.xpath("//button[@routerlink='/edit']")).click();
		WebElement ele =driver.findElement(By.xpath("//input[@value='ortonikc']"));
		String result =ele.getAttribute("value");
		System.out.println("TextBox 3 value: " + result);
		System.out.println("Test3 Passed!!!");
	  }

	  
	  @Test(priority = 4)
	  public void test4() 
	  {
		driver.get("https://letcode.in/");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='button is-white']")).click();
		driver.findElement(By.xpath("//button[@routerlink='/edit']")).click();
		driver.findElement(By.xpath("//input[@value='Koushik Chatterjee']")).clear();
		driver.findElement(By.xpath("//input[@value='Koushik Chatterjee']")).sendKeys("DESHAN");
		System.out.println("Test4 Passed!!!");
	  }

	  
	  @Test(priority = 5)
	  public void test5() 
	  {
		driver.get("https://letcode.in/");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='button is-white']")).click();
		driver.findElement(By.xpath("//button[@routerlink='/edit']")).click();
		WebElement ele = driver.findElement(By.xpath("//label[text()='Confirm edit field is disabled']/following::input"));
	   if (ele.isEnabled())
	   {
		   System.out.println("Yes, field is Enable");
	   }
	   else
	   {
		   System.out.println("No , field is Disable State");
	   }
	    
	  }

	 
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	 
	 
	  
  }
  

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
