package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTst {
public static AndroidDriver driver;
	@BeforeMethod
	public void BeforeMethod() throws Exception
	{
	    DesiredCapabilities cap =new DesiredCapabilities(); 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);

	}


}
