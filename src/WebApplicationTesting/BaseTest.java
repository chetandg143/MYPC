package WebApplicationTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

		AndroidDriver<MobileElement> driver = capabilities();
		System.out.println("Android is running");
	}

	public static AndroidDriver<MobileElement> capabilities() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// 1 way
		/*cap.setCapability("deviceName ", "Chetan");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("automationName", "appium");
		URL u = new URL("http://localhost:4723/wd/hub");
		
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
		return driver;*/
          
		// 2 way
		/*cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.miui.calculator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(2000);
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
		return driver;*/

		
		// other way
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
				cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
				cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
				cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
				URL u = new URL("http://0.0.0.0:4723/wd/hub");
				Thread.sleep(2000);
				AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
				return driver;
	
		
	//3 way // in mobile API demos
		
	/*	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Chetan");
		cap.setCapability(MobileCapabilityType.APP,"‪C:\\Android\\ApiDemos-debug.apk");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
		return driver;	*/
		
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.");
//		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lenovo.deskclock");
//		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
//		URL u = new URL("http://localhost:4723/wd/hub");
//		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
//		return driver;

	}
}
	


