package seleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalSeleniumTest {
    public static void main(String[] args) {
    	 
        System.setProperty("webdriver.chrome.driver", "D:\\654259023\\seleniumGrid\\chromedriver-win64\\chromedriver.exe");
 
        WebDriver driver = new ChromeDriver();
 
        driver.get("http://www.google.com");

 
        System.out.println("Title: " + driver.getTitle());
 
        driver.quit();
    }
}
