package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browsermanager extends Utils {
    public void openBrowser() {
        // set property and path of driver
        System.setProperty("WebDriver.Chrome.driver", "src/test/Resources/driver/chromedriver.exe");

        // initiated to chrome driver
        driver = new ChromeDriver();

        //to open browser to maximize
        driver.manage().window().maximize();

        // set implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // open url
        driver.get("https://demo.nopcommerce.com/");
    }

    public void closeBrowser()
    {
        driver.quit();
    }
}
