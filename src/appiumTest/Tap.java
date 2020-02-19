package appiumTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Tap extends Base {

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"App\")").click();
		
		WebElement ele =driver.findElementByAndroidUIAutomator("text(\"Alarm\")");
		
		TouchAction ta = new TouchAction(driver);
		
		TapOptions to = new TapOptions();
		ta.tap(to.withElement(ElementOption.element(ele))).perform();
		
		 
	 	   
	 	  
		}

}
