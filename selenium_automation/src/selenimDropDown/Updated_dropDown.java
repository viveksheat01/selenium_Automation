package selenimDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		String str1=	driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(str1);
		
		for (int i = 1; i <5; i++) {
			
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
	
		
		}
		String str=	driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(str);
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();
	}

}
