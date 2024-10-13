package co.in.infinitegreen.testcases;

import org.testng.annotations.*;



import co.in.infinitegreen.utilities.ReadConfig;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    ReadConfig readConfObj = new ReadConfig();
    String url = readConfObj.getBaseUrl();
    String browser = readConfObj.getBrowser();

    public WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public void SetUp() {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                driver = null;
                break;
        }

        if (driver != null) {
            driver.manage().window().maximize();
            driver.get(url);
        }
        
        //logging
        logger = LogManager.getLogger("InifiniteGreen");
        
        
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // for all web elements
    }
	/*
	 * @AfterClass public void tearDown() { driver.close(); driver.quit();
	 * 
	 * }
	 */
    
    public void captureScreenshots(WebDriver driver,String testName) throws IOException 
    {
    	TakesScreenshot screenshot = ((TakesScreenshot)driver); // TypeCast the object of the TakeScreenshot
    	File src = screenshot.getScreenshotAs(OutputType.FILE);
    	
		File des = new File(System.getProperty("user.dir")+"//Screenshots//"+ testName +".png");
		FileUtils.copyFile(src, des);
	}
}
