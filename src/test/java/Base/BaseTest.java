package Base;


import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {

       driver = new DriverFactory().initializeDriver();
    }

    //  @AfterClass
    public void tearDwn() {
        driver.quit();
    }


}
