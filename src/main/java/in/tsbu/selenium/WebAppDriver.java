package in.tsbu.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebAppDriver {

    public WebDriver driver;
    public String baseUrl;
    public WebAppDriver()
    {
        this.baseUrl ="https://www.google.com/";
    }

    public WebAppDriver(String url)
    {
        initDriver();
        this.baseUrl =url;
    }


    public void initDriver() {
        System.out.println("Open browser");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
