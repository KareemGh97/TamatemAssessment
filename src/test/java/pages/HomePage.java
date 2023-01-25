package pages;

import Base.BasePage;
import Helpers.ActionHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "/html/body/app-root/div[1]/app-header/div/div/div[3]/div/div[1]")
    private WebElement createNewAccountBtn;


    public void clickOnCreateNewAccountBtn(){
        ActionHelper.waitForExistance(createNewAccountBtn,5);
        createNewAccountBtn.click();
    }

}
