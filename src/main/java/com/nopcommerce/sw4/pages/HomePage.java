package com.nopcommerce.sw4.pages;

import com.nopcommerce.sw4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By welcomeOurStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = findElementsFromWebPage(By.cssSelector("li>a"));
        for (WebElement names : topMenuNames) {
            //System.out.println(names.getText());
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public String getWelcomeOurStoreText() {
        return getTextFromElement(welcomeOurStoreText);
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOutButton);
    }

}

