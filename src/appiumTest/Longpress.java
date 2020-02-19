package appiumTest;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Longpress extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByXPath("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		WebElement e1 = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adpater\")");
		
		TouchAction tc = new TouchAction<>(driver);
		TapOptions to = new TapOptions();
		tc.tap(to.withElement(ElementOption.element(e1))).perform();
		
		WebElement e2 =driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		
		tc.longPress(new LongPressOptions().withElement(ElementOption.element(e2)).withDuration(Duration.ofSeconds(2))).release().perform();
	//	Thread.sleep(2000);
		System.out.println(driver.findElementByAndroidUIAutomator("android:id/title").getText());
		
		
		
		
	}

}

