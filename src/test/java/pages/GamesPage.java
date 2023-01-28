package pages;

import Base.BasePage;
import Helpers.ActionHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamesPage extends BasePage {
    public GamesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "/html/body/app-root/div[1]/app-header/div/div/div[2]/div[2]")
    private WebElement gamesTab;
    @FindBy(xpath = "/html/body/app-root/div[1]/div/div/app-game-list/div/div/div/div[1]/div/div/div[2]/button")
    private WebElement browseBtn;

    @FindBy(xpath = "/html/body/app-root/div[1]/div/div/app-game-details/div/div[1]/div/div/div[2]/div[2]")
    public static WebElement gameTitle;

    public GamesPage clickOnGamesTab(){
        gamesTab.click();
        return this;
    }
    public void openKingsChallengeGame() {
        ActionHelper.waitForExistance(browseBtn, 20);
        browseBtn.click();
    }
}
