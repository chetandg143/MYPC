package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScreenRotator extends Base {

	public static void main(String[] args)  throws MalformedURLException, InterruptedException
	{
	
     AndroidDriver<MobileElement>  driver = capabilities();
     
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     driver.rotate(ScreenOrientation.LANDSCAPE);
     Thread.sleep(2000);
     driver.rotate(ScreenOrientation.PORTRAIT);
     
	}

}
