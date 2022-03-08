package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.Page_1;
import pageObject.Page_2;

public class Api_DemoTC extends Base {
	@Test
	public void myFirstCase() throws IOException, InterruptedException{
		
		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(1000);

		Page_1 firstPage = new Page_1(driver);
		firstPage.clickViews.click();
		Thread.sleep(1000);
		
		Page_2 secondPage = new Page_2(driver);
		secondPage.dragNdrop.click();
		Thread.sleep(1000);
		
		
		
		
	}

}








