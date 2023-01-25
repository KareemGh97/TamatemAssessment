package testCases;


import Base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCase extends BaseTest {

    @Test
    public void logIn() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.clickOnCreateNewAccountBtn();

        loginPage.clickSignInButton()
                .clickOnLoginByEmailBtn()
                .fillEmailTxtBox("ghnaimatk@gmail.com")
                .fillPasswordTxtBox("Ka123456")
                .clickLoginUpBtn();
    }
}
