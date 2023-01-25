package Helpers;

import org.openqa.selenium.WebElement;

public class ActionHelper {

    public static boolean waitForExistance(WebElement element, int seconds) {
        boolean isExist = false;

        int count = 1;
        while (count <= seconds) {
            try {
                Thread.sleep(1000);
                if (element.isDisplayed()) {
                    isExist = true;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Exception message: " + e.getMessage());
            }
            count++;
        }

        return isExist;
    }
}
