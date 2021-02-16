package selenimDropDown;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		
		Set<String>windows=driver.getWindowHandles(); /// store parentid and child id
		
		// store the windows id
		Iterator<String>it=windows.iterator();
	
		String parentId=it.next();
		String childId=it.next();
		
		//switch to parent id to child id
		driver.switchTo().window(childId);
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]")).getText());
		driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]")).getText();
		
		
	String emailId=	driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]")).getText().split("at")[1].trim().split(" ")[0];
	System.out.println(emailId);
	
	// switch to child to parentwindows id
	driver.switchTo().window(parentId);
	driver.findElement(By.id("username")).sendKeys(emailId);
	
	driver.quit();
		
	}

}
