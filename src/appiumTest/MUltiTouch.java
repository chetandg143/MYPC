package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.contentstream.operator.graphics.MoveTo;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class MUltiTouch {

	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Demo1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.the511plus.MultiTouchtester");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.the511plus.MultiTouchTester.mul");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
         
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		TouchAction ta1 = new TouchAction<>(driver).press(PointOption.point(85,250))
				.moveTo(PointOption.point(100,358)).release();
		
		TouchAction ta2 = new TouchAction<>(driver).press(PointOption.point(95,262))
				.moveTo(PointOption.point(125,358)).release();
	
	   MultiTouchAction mt = new MultiTouchAction(driver);
	   mt.add(ta1).add(ta2).perform();
	   
	}

}
