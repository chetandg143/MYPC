package appiumTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TapScreen {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	    DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(2000);
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
		

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"App\")").click();
		
		WebElement ele =driver.findElementByAndroidUIAutomator("text(\"Alarm\")");
		
		TouchAction ta = new TouchAction(driver);
		
		TapOptions to = new TapOptions();
		ta.tap(to.withElement(ElementOption.element(ele))).perform();
		
		  TakesScreenshot ts =(TakesScreenshot)driver;
	 	    File srcfile =ts.getScreenshotAs(OutputType.FILE);
	 	    File desfile = new File("D:\\Appium\\Appium\\Screenshot\\i2.png");
	 	    Files.copy(srcfile,desfile);
	 	    System.out.println("Testcase is Pass");
	 	   
	 	  


	}

}
