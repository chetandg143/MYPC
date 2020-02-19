package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Press extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		TouchAction ta = new TouchAction<>(driver);
		
		ta.press(new PointOption<>().withCoordinates(273, 1049)).release().perform();
		

	}

}
