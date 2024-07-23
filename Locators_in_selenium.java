//Locators are the way to identify an HTML element on a web page
//Selemium Web driver uses any of the below locators to identify the element on the page and performs an action
//
eg-
  Id
  Xpath
  Css Selectors
  Tag Name 
  Link Text 
  Partial Link Text

  Example of code:-
  package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
      public static void main(String[] args)
      {
    	  WebDriver driver = new ChromeDriver();
    	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
    	  driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    	  driver.findElement(By.name("inputPassword")).sendKeys("hello123");
    	  driver.findElement(By.className("signInBtn")).click();
      }
}
