package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://store.tamatem.co/");
        driver.manage().window().maximize();
    }

    //  @AfterClass
    public void tearDwn() {
        driver.quit();
    }


}
