package digibank;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;


    public static void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13");
        cap.setCapability(MobileCapabilityType.UDID,"RRCW103DSTN");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy A53 5G");
        cap.setCapability("appPackage","com.dbs.id.dbsdigibank");
        cap.setCapability("appActivity","com.dbs.id.dbsdigibank.ui.splash.SplashActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url,cap);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println("starting driver");

    }
    public static void tearDown(){
        driver.quit();
    }
}
