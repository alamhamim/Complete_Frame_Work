package com.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {

    public void startAPP(String os, String browserName, String url, WebDriver driver) {

        if (browserName.equalsIgnoreCase("chrome")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "Drivers/windowsDriver/chromedriver.exe");
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "Drivers/macDriver/chromedriver");

            } else if (os.equalsIgnoreCase("linux")) {
                System.setProperty("webdriver.chrome.driver", "Driver/linuxDriver/chromedriver");

            }

            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.gecko.driver", "Drivers/windowsDriver/geckodriver.exe");

            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.gecko.driver", "Drivers/macDriver/geckodriver");

            } else if (os.equalsIgnoreCase("linux")) {
                System.setProperty("webdriver.gecko.driver", "Drivers/linuxDriver/geckodriver");

            }
        } else if (browserName.equalsIgnoreCase("s")) {
        }


    }



}
