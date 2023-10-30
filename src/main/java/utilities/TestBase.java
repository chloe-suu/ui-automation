package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public static WebDriverWait wait;
    
    public final static int TIMEOUT = 10;
    
    public TestBase() {
    	try {
    		prop = new Properties();
    		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")
    				+ "/src/main/java/config/config.properties");
    	prop.load(fi);
    	}catch(IOException e) {
    		e.getMessage();    	}
    }

    public void initiate() {
    	String browserName = prop.getProperty("browser");
    	switch (browserName) {
    	case "chrome":{
    		System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir")
                    + "\\src\\main\\resources\\drivers\\chromedriver.exe");
    		driver = new ChromeDriver();
    		break;}
    	}
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
         driver.manage().window().maximize();
         wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
         driver.navigate().to(prop.getProperty("url"));
         JavascriptExecutor js = (JavascriptExecutor) driver;
    	 
    }
    public void openPage(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void tearDown() {

        if(driver!=null) {
            driver.close();
            driver.quit();
        }
    }

}
