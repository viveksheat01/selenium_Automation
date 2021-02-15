package waitStatementInWD;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitiliWaitTest {

	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium webdriver\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().notifyAll();
		
		driver.get("");

	}

}
