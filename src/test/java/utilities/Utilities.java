package utilities;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {
	AndroidDriver<AndroidElement>driver;
	
	public Utilities(AndroidDriver<AndroidElement>driver) {
		this.driver = driver;
	}
	public void longPress(String value) {
		  @SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		  action.perform();
		}
}
