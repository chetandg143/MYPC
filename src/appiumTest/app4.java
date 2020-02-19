package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class app4 extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("123");
		
		driver.findElement(By.id("android:id/button1")).click();

	}

	}


