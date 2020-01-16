import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class CalculatorTest {

	 
	static AppiumDriver<MobileElement> adriver;
	static AndroidDriver<MobileElement> mdriver;
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		try {
			opencalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void opencalculator() throws Exception
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pie9.0");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.APPLICATION_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT ,"25");
		//cap.setCapability("app", app.getAbsoluPath());
		 
		 
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Application Started.....");
		
	}
}
