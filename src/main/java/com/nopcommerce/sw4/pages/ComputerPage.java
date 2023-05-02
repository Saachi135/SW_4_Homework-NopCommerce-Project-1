package com.nopcommerce.sw4.pages;

import com.nopcommerce.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By desktopCategory = By.xpath("//img[@alt='Picture for category Desktops']");

    public void clickOnDesktopCategory() {
        clickOnElement(desktopCategory);


    }
}
