package in.tsbu.selenium;

import in.tsbu.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebAppDriver {

    public String baseUrl;
    public WebDriver driver;

    public WebAppDriver() {
        this.baseUrl = "https://www.google.com/";
    }

    public WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("Driver Initiation");
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }

    public void closeDriver() {
        driver.close();
    }


}
