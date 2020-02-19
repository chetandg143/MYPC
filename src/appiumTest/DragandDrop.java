package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragandDrop extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"))");
		driver.findElementByXPath("text(\"Views\")").click();
		driver.findElementByXPath("//android widget.TextView[@content-desc='Drag and Drop']").click();
		
		TouchAction ta = new TouchAction(driver);
		LongPressOptions lpo = new LongPressOptions();
		
		WebElement ele1 = driver.findElementByXPath("//android.view.View[@index = '1']");
		WebElement ele2 = driver.findElementByXPath("//android.view.View[@index = '4']");
		ta.longPress(lpo.withElement(ElementOption.element(ele1))).moveTo(ElementOption.element(ele2)).release().perform();
		ta.longPress(lpo.withElement(ElementOption.element(ele1))).moveTo(ElementOption.element(ele2)).release().perform();
		
		
	}

}
