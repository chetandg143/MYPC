package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		AndroidDriver<MobileElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("android:id/button1").click();
	     Thread.sleep(2000);
		driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
		driver.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
		driver.findElement(By.id("com.miui.calculator:id/btn_mul_s")).click();
		driver.findElement(By.id("com.miui.calculator:id/btn_7_s")).click();
		

	}

}
