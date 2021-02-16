package packegeDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSlcertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SSL certification
		
		// Desired capabilities
		
		DesiredCapabilities ch=new DesiredCapabilities().chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ch.acceptInsecureCerts();
		
		ChromeOptions co=new ChromeOptions();
		co.merge(ch);
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(co);
		

	}

}
