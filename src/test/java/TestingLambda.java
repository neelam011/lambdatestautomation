import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestingLambda {

	public static void main(String[] args) throws MalformedURLException {
		

		
		ChromeOptions browserOptions = new ChromeOptions();
	//	FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("130");
		
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("deviceName", "Pixel 7");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("visual", true);
		capabilities.setCapability("network", true);
		capabilities.setCapability("video", true);*/
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "jagtapneelam011");
		map.put("accessKey", "Ww3vbgygcZTxv0KRsSkqizW5rfQHj9kmcxjaD9o8wtswp4TO9f");
		map.put("project", "selenium test on grid");
		//ltOptions.put("selenium_version", "4.0.0");
		//ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", map);
		
		URL url=new URL("https://jagtapneelam011:Ww3vbgygcZTxv0KRsSkqizW5rfQHj9kmcxjaD9o8wtswp4TO9f@hub.lambdatest.com/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,browserOptions);
		driver.get("https://en.wikipedia.org/wiki/Software_testing");
		String s=driver.getTitle();
		System.out.println("Title of the page"+s);
		driver.quit();
		
		
		

		
		
		
		
	
	}

}
