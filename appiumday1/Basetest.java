package appiumday1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Basetest {
	public AndroidDriver driver;
	 public AppiumDriverLocalService appiumServiceBuilder;
	 @BeforeClass
	public void appiumtest() throws MalformedURLException, URISyntaxException {
		 appiumServiceBuilder = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Lenovo//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		// to start the server automatically
	appiumServiceBuilder.start(); 
	//by automatically r run in command prompt
	
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Dhivyaphone");
		options.setApp("C://Users//Lenovo//eclipse-workspace//APPIUM//src//test//java//resources//ApiDemos-debug.apk");

		 driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
		 // to give the timeout for from one page to another
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	 
	 
	 
	 
	 public void longressaction(WebElement element) {
//			
//			/// Java
//			((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
//				    "elementId", ((RemoteWebElement) element).getId()
//				));
//			
			
			
	          //casting into java script                                                             //key pair		//valuepair
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)element).getId()
				                                                                         //main class for all element
				,"duration",2000));// timeout should given 2 s means it taken in milli seceonds so give --2000
		// key should always in double quotes
		
	 }
	 
	 
	 
	 public void scrollendaction() {
		 // scroll untill the last element-- put do while (true) condition
			boolean canScrollMore;
			do {
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "down",
				    "percent", 1.0
				));
			}while(canScrollMore);
			
	 }
	 
	 
	 public void swipetestaction( WebElement ele,String direction) {
		// swipe
			// Java
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of
					("elementId",((RemoteWebElement)ele).getId(),
			      "direction", direction,
			    "percent", 0.75
			));
			
			
	 }
	 
	 
	 
	 
	 
	 
//	 @AfterClass
//	public void driverclose() {
//		driver.quit();
//		//to stop the server
//		 
//		appiumServiceBuilder.stop();
//	}

}
