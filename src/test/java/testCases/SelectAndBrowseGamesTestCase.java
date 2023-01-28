package testCases;


import Base.BaseTest;
import Helpers.ActionHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GamesPage;
import pages.HomePage;
import pages.LoginPage;

import static pages.GamesPage.gameTitle;

public class SelectAndBrowseGamesTestCase extends BaseTest {

    @Test(priority = 1,description = "verify that the user is able to login by his email and password ")
    public void logIn() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.clickOnCreateNewAccountBtn();
        //here iam using chaining command to make the login steps readable
        loginPage.clickSignInButton()
                .clickOnLoginByEmailBtn()
                .fillEmailTxtBox("ghnaimatk@gmail.com")
                .fillPasswordTxtBox("Ka123456.")
                .clickLoginUpBtn()
                .navigateToHomePage();
        //assert that the user is successfully login to home page by check the page link
        driver.getCurrentUrl().contains("home");
    }

    @Test(priority = 2, description = "verify that the user is able to navigate to games page and pick a game to browse ")
    public void openGameTab() {
        GamesPage gamesPage = new GamesPage(driver);
        gamesPage.clickOnGamesTab()
                .openKingsChallengeGame();
        //assert that the user is successfully navigate to the specific game page
        ActionHelper.waitForExistance(gameTitle, 10);
        Assert.assertTrue(gameTitle.isDisplayed());
    }
}
