	package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


class TestGrid {

	 @Test
	 void test1() {
	        String hubURL = "http://192.168.56.1:4444/wd/hub"; 
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setBrowserName("chrome");
	        WebDriver driver = null;

	        try {
	 
	            driver = new RemoteWebDriver(new URL(hubURL), capabilities);
	            driver.get("http://www.google.com");
	            System.out.println("Title: " + driver.getTitle());
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } finally {
	            if (driver != null) {
	                 driver.quit();
	            }
	        }
	 }
	 
	 
	 @Test
	 void test2() {
	        String hubURL = "http://192.168.56.1:4444/wd/hub"; 
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setBrowserName("MicrosoftEdge");
	        WebDriver driver = null;

	        try {
	 
	            driver = new RemoteWebDriver(new URL(hubURL), capabilities);
	            driver.get("http://www.google.com");
	            System.out.println("Title: " + driver.getTitle());
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } finally {
	            if (driver != null) {
	                 driver.quit();
	            }
	        }
	 }
	 
	 
	 @Test
	 void test3() {
	        String hubURL = "http://192.168.56.1:4444/wd/hub"; 
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setBrowserName("firefox");
	        WebDriver driver = null;

	        try {
	 
	            driver = new RemoteWebDriver(new URL(hubURL), capabilities);
	            driver.get("http://www.google.com");
	            System.out.println("Title: " + driver.getTitle());
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } finally {
	            if (driver != null) {
	                 driver.quit();
	            }
	        }
	 }
	 
	 
	 @Test
	 void test4() {
	        String hubURL = "http://192.168.56.1:4444/wd/hub"; 
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setBrowserName("chrome");
	        WebDriver driver = null;

	        try {
	 
	            driver = new RemoteWebDriver(new URL(hubURL), capabilities);
	            driver.get("http://www.google.com");
	            System.out.println("Title: " + driver.getTitle());
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } finally {
	            if (driver != null) {
	                 driver.quit();
	            }
	        }
	 }

}
