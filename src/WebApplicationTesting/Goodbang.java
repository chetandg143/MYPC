package WebApplicationTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Goodbang {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Chetan");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.banggood.com/");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='bottom_bar_icon bottom_bar_icon_category']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='icon icon140']")).click();
        
        
        
	}

}
