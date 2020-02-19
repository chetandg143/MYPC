package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Seekbar extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"))");
		driver.findElementByXPath("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))").click();
		MobileElement seek = driver.findElementById("io.appium.android.apis:id/seek");
		Point p = seek.getLocation();
		int startx = p.getX();
		int starty = p.getY();
		Dimension size =seek.getSize();
		int endx = (int) (startx +size.getWidth() * 0.60 );
		int endy =starty;
		TouchAction ta = new TouchAction<>(driver);
		ta.press(PointOption.point(startx,starty)).moveTo(PointOption.point(endx,endy)).release().perform();
		
		
	}

}
