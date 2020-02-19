package POM;

import org.testng.annotations.Test;
import POM.ApiDemoPage;
public class APITest  extends BaseTest
{
@Test
public void test() throws InterruptedException 
{
	ApiDemoPage ap =new ApiDemoPage(driver);
	ap.viewsclick();
}
}
