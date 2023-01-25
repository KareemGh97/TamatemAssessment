package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {

    private WebDriver driver;

    public WebDriver initializeDriver() {

        String browser = System.getProperty("browser","chrome");
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Safari":
                driver = new SafariDriver();
                break;

            default:
                throw new RuntimeException("the browser is not supported");

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        return driver;
    }
}
