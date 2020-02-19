package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.contentstream.operator.graphics.MoveTo;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"App\")").click();
		Thread.sleep(2000);
		
		Dimension size =driver.manage().window().getSize();
		System.out.println(size);
		int starty = (int) (size.height *0.8);
		int endy = (int ) (size.height * 0.2);
		int startx = size.width /2 ;
		System.out.println(starty + " " + endy);
		
		TouchAction ta = new TouchAction<>(driver);
		ta.press(PointOption.point(startx,starty)).moveTo(PointOption.point(startx,endy)).release().perform();
        		

	}

}
