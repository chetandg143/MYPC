package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Options extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException   {
	
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.getDeviceTime());
		

	}

}
