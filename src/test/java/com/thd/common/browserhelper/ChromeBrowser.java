package com.thd.common.browserhelper;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thd.common.utils.PropertyUtil;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

class ChromeBrowser extends ChromeDriver {

    private ChromeBrowser() {
        super();
    }

    private ChromeBrowser(ChromeOptions chromeOptions) {
        super(chromeOptions);
    }

    public static WebDriver buildChromeBrowser() {

        WebDriver driver;
//      WebDriverManager is for invoking specific chrome browser version from Maven dependency (io.github.bonigarcia webdrivermanager)
        WebDriverManager.chromedriver().version("78.0.3904.11").setup();
//
// {
// ChromeDriverManager is for invoking chrome browser dynamically
//       ChromeDriverManager.getInstance().setup();
// }
//  {    Passing the chrome path from Local
//      System.setProperty("webdriver.chrome.driver", PropertyUtil.getProp().getProperty("local.driver.location"));
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\RXM8315\\workspace\\WD_Jan7_2019\\chromedriver.exe");
//    }
        ChromeBrowser browser = new ChromeBrowser();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return browser;
    }


    public static WebDriver buildChromeHeadless() {
        System.setProperty("webdriver.chrome.driver", PropertyUtil.getProp().getProperty("local.driver.location"));
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary(PropertyUtil.getProp().getProperty("local.browser.binary"));
        chromeOptions.addArguments("--headless");
        ChromeBrowser browser = new ChromeBrowser(chromeOptions);
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return browser;
    }
}
