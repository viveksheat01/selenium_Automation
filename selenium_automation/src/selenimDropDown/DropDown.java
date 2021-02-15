package selenimDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement drodown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dp=new Select(drodown);
		
		dp.selectByVisibleText("USD");
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByIndex(2);
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByVisibleText("INR");
		System.out.println(dp.getFirstSelectedOption().getText());
	}

}
