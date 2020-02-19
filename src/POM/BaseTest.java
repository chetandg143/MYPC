package POM;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest 
{
	public static AndroidDriver driver; 
		@BeforeMethod
		public void BeforeMethod() throws Exception
		{
		    DesiredCapabilities cap =new DesiredCapabilities(); 
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
			cap.setCapability(MobileCapabilityType.FULL_RESET,false);
			cap.setCapability(MobileCapabilityType.NO_RESET,true);
			cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
			
			URL u = new URL("http://0.0.0.0:4723/wd/hub");
			AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
			}
@AfterMethod
public void teardown()
{
	driver.quit();
}
}
