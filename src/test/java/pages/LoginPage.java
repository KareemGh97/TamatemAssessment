package pages;

import Base.BasePage;
import Helpers.ActionHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/div[1]/div/div/app-signup-tabs/div/div[1]/div/div[2]/span")
    private WebElement signInBtn;
    @FindBy(xpath = "//a[text()='البريد الإلكتروني']")
    private WebElement loginByEmailBtn;

    @FindBy(xpath = "//input[@placeholder='ادخل بريدك الإلكتروني']")
    private WebElement emailTxtBox;

    @FindBy(xpath = "//input[@placeholder='ادخل كلمة المرور']")
    private WebElement passwordTxtBox;


    @FindBy(xpath = "//span[text()=' تسجيل الدخول ']")
    private WebElement loginBtn;

    @FindBy(xpath = "/html/body/app-root/div[1]/app-header/div/div/div[2]/div[1]")
    public static WebElement homeBtn;

    //make the methods return th page object, so we can use chaining commands
    public LoginPage clickSignInButton() {
        ActionHelper.waitForExistance(signInBtn, 5);
        signInBtn.click();
        return this;
    }

    public LoginPage clickOnLoginByEmailBtn() {
        ActionHelper.waitForExistance(loginByEmailBtn, 5);
        loginByEmailBtn.click();
        return this;
    }

    public LoginPage fillEmailTxtBox(String Email) {
        emailTxtBox.sendKeys(Email);
        return this;
    }

    public LoginPage fillPasswordTxtBox(String password) {
        passwordTxtBox.sendKeys(password);
        return this;
    }

    public LoginPage clickLoginUpBtn() {
        loginBtn.click();
        return this;
    }

    public void navigateToHomePage() {
        ActionHelper.waitForExistance(homeBtn, 20);
        homeBtn.click();
    }

}
