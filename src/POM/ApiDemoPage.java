package POM;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ApiDemoPage 
{
@FindBy(xpath="//android.widget.TextView([@text='Views'])")
private MobileElement views;

public ApiDemoPage(AndroidDriver driver)
{
PageFactory.initElements(new AppiumFieldDecorator(driver),this);	
}

public void viewsclick() throws InterruptedException 
{
	Thread.sleep(2000);
	views.click();
}
}
