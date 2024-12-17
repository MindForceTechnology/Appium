package appiumday1;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class scrolldemo extends Basetest{
	
	@Test
	public void scrolldemotest() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
      // common steps for all scrolling		
		// where to scroll is prior or known---scroll to excat element
		                                               //class            //argument         //method
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		
		
		
		
		// ALternate way for scrolling--- scroll by step by step
		
//		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", 100, "top", 100, "width", 200, "height", 200,
//			    "direction", "down",
//			    "percent", 1.0
//			));
		scrollendaction();
		
		
		
		
		
		
		
		
	}

}
