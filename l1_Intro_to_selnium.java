Web driver- Web driver  is an interface which provides set of browser automation methods with empty bodies (abstract methods)
-> classes like chromeDriver, firefox Driver , Microsoft Edge Driver, Safari Driver etc implement the web driver interface and provide their own implementation to the web driver methods
->As part of automation ,selenium performs actions (such as click ,typing ) on the page of HTML elements
-> this is the example code of the above theory 
package SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
         public static void main(String[] args) {
        	 //invoking Browser
        	 //Chrome - ChromeDriver ->methods
        	 //Firefox- fireFoxDriver->methods 
        	 //Safari SaariDriver->methods close get
        	 //methods are same in all the browsers
        	 // ChromeDriver have webDriver methods+ class methods
        	 
        	 //chromedriver.exe-> Chrome Browser it invokes the chrome browser
        	 //set to invoke Chrome Driver
        	 // Selenium Manager responsible for invoking the browser
        	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\deerai1\\Downloads\\chromedriver_win32");
//        	 WebDriver driver= new ChromeDriver();
//        	// driver.resetInputState();
//        	 
//        	 driver.get("https://rahulshettyacademy.com");
//        	 System.out.println(driver.getTitle());  
//        	 System.out.println(driver.getCurrentUrl());
//        	 //it will close only the current tab
//        	 driver.close();
//        	 
//        	 //it will close all the associated windows opened by selenium
//        	 driver.quit();
//        	 
        	 
        	 
        	 //how to run the same script for firefox
        	 //firefox launch
        	 //gaeckodriver acts as an interface between selenium and browser
//        	 WebDriver driver= new FirefoxDriver();
//        	 
//        	 driver.get("https://rahulshettyacademy.com");
//        	 System.out.println(driver.getTitle());  
//        	 System.out.println(driver.getCurrentUrl());
        	 //it will close only the current tab
        	// driver.close();
        	 
        	 //it will close all the associated windows opened by selenium
        	 //driver.quit();
        	 
        	 
        	 //how to run the same script for edge driver
             WebDriver driver= new EdgeDriver();
        	 
        	 driver.get("https://rahulshettyacademy.com");
        	 System.out.println(driver.getTitle());  
        	 System.out.println(driver.getCurrentUrl());
        	 driver.close();
        	 
         }
}
