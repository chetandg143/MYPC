package Fynd.apk;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Startup {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
		{

			AndroidDriver<MobileElement> driver = capabilities();
			System.out.println("Android is running");
		}

		public static AndroidDriver<MobileElement> capabilities() throws MalformedURLException
		{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "co.go.fynd.activity.AppHomeActivity");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "co.go.fynd");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
		return driver;


	}

}
