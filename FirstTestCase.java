package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestCase {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","D:/Lib/geckodriver-v0.23.0-win64/geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("http://www.store.demoqa.com");
        driver.quit();


    }
}
