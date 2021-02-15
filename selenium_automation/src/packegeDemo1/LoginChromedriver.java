package packegeDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginChromedriver {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium webdriver\\drivers\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\selenium webdriver\\drivers\\geckodriver.exe");
		 * 
		 * WebDriver driver=new FirefoxDriver();
		 */
		
		System.setProperty("webdriver.edge.driver", "D:\\selenium webdriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");

		System.out.println(driver.getCurrentUrl());
		
	}

}
