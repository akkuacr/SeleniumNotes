package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
      public static void main(String[] args) throws InterruptedException
      {
    	  WebDriver driver = new ChromeDriver();
    	 
    	  //implicit wait - 2 seconds timeout
    	  //implicit wait is waiting for something to show
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	  
    	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
    	  driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    	  driver.findElement(By.name("inputPassword")).sendKeys("hello123");
    	  driver.findElement(By.className("signInBtn")).click();
          
    	  
    	  //Css Selector
    	  //class name->tagname.classname
    	  //Id->tagname#id -> input#inputUserName
    	  //Tagname[attribute='value']
    	  //input[type*='pass']
    	  
    	  //Three ways to css selector
    	 
    	  // to check whether a given selector is unique or not write $('p.error') it will show all the elements having such tag
    	  System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    	  
    	 //to check whether a given link is present or not and click it
    	  
    	  driver.findElement(By.linkText("Forgot your password?")).click();
    	  //it will pause the java execution for 1 minute
    	 Thread.sleep(1000);
    	  //Xpath is used for navigation to html elements 
    	  //Xpath-
    	  //Tagname[@attribute='value']
    	  //input[@placeholder='Username"]
    	  //Tagname[@attribute='value'][index]
    	  //parentTagname/childtagName
    	  //button[contains(@class,'submit')]-Regular expression
    	  
    	  driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
    	   
    	   driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@gmail.com");
    	  // driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john12@gmail.com");
    	   
    	   
    	   
    	   //from parent to child xpath read from left to right
    	   driver.findElement(By.xpath("//form/input[3]")).sendKeys("9389550242");
    	   
    	  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    	  System.out.println(driver.findElement(By.cssSelector("form p")).getText());  
    	  
          driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    	  Thread.sleep(1000);
          driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
    	  driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
    	  driver.findElement(By.id("chkboxOne")).click();
    	  driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    	  //it will give all the elements having the same class
    	  //$x('input[type='text'])
      
      }
}
