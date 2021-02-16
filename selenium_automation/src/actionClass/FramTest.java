package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		driver.findElement(By.id("draggable")).click();
		
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
	//	driver.close();
	}

}
