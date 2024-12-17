package appiumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class longpress extends Basetest {
	@Test
	public void longpressgesture() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		// to click long press
					// for value we should take the xpath 
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		
/*              // moved into baseclass
//	      //casting into java script                                                             //key pair		//valuepair
//			((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)element).getId()
//					                                                                         //main class for all element
//					,"duration",2000));// timeout should given 2 s means it taken in milli seceonds so give --2000
//			// key should always in double quotes             */
		
		
		
   // calling that longpressmethod in basetest
		longressaction(element);
		
		
	// after that long press to check the sample menu is present is that popup window by putting assertion
	String title = driver.findElement(By.id("android:id/title")).getText();
	Assert.assertEquals(title, "Sample menu");
	//alternate option
	Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	
		
		
		
	}

}
