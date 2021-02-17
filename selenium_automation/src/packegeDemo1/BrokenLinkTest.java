package packegeDemo1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium_drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//broken URL
		// step 1 it to get urls tied up to the link using selenium
		// java method will call URL and gets you the status code
		// if status code >400 then that url is not working >> link which tied ti url is broken.
		//a[href*="soapui"]
		
driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		
		
		List<WebElement>	links=driver.findElements(By.cssSelector(("li[class='gf-li'] a")));
		
		SoftAssert a=new SoftAssert();
		
		for(WebElement link: links)
		{
			// String url=	driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
			
			String url=link.getAttribute("href");

		     HttpURLConnection	conn=(HttpURLConnection)new URL(url).openConnection();
		     conn.setRequestMethod("HEAD");
		     conn.connect();
		 int respCode=    conn.getResponseCode();
		System.out.println(respCode);
		
		a.assertTrue(respCode>400, "the print with text" + link.getText()+ " is broken with code + respCode");
		
		}	
		a.assertAll();
	     
		
	}
	

}
