package appiumday1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Appiumbasics  extends Basetest{
	
	@Test
	public void Wifisettings() throws MalformedURLException, URISyntaxException {
		//appium code--- appium server-- mobile
		
		//xpath,id,accessbilityid,classname,uiautomator
		 driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		 //tagname[@attribute='value']
		 // to click the prefernce dependencies
		 driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		 // to click wifi checkbox
		 driver.findElement(By.id("android:id/checkbox")).click();
		 //to click the wifi settings
		 // if the xpath is to large take the loacator as //tagname
		 driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		 // grab the text from popup and put the assertion
		 String actual = driver.findElement(By.id("android:id/alertTitle")).getText();
		 // assertion give to check the title equals
		 //we can give the wrong title to check the assertion throws an error
		 Assert.assertEquals(actual, "WiFi settings");
		 //)
		 // enter the settings name
		 driver.findElement(By.id("android:id/edit")).sendKeys("wifi name");
		 
		 // to click the ok button --for id and classname we can use appiumby
		 //classname is common for both cancel and ok so we give ok and give index 1---- to handle the mobile popup
		 driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		 
		 
		 

	}
	

}
