package com.crm.SeleniumUtility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility
{
    private Actions act; 

    // Constructor
    public ActionsUtility(WebDriver driver) {
        act = new Actions(driver);
    }

    // Method to select option using Arrow Down and Enter
    public void selectByArrowDownAndEnter(int count) {

        for (int i = 0; i < count; i++) {
            act.sendKeys(Keys.ARROW_DOWN).perform();
        }
        act.sendKeys(Keys.ENTER).perform();
    }
}
