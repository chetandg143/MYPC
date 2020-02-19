package WebApplicationTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hybridapps {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
        DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Chetan");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.snc.test.webview2");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.snc.test.webview.activity.SplashActivity");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(u, cap);
		System.out.println(driver.getContext());
		
		driver.findElementById("com.snc.test.webview2:id/action_go_website").click();
		driver.findElementById("android:id/button1").click();
		Thread.sleep(2000);
		
		//we then need to switch on web view to further action we can get it.
		//list of content using fallowing commands 
		
		System.out.println(driver.getContextHandles());
		Set<String> h =driver.getContextHandles();
		List<String> ls =new ArrayList<String>(h);
		driver.context(ls.get(1));
		System.out.println(driver.getContext());
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(" Test Yantra ",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);


	}

}
