package com.nopcommerce.sw4.pages;

import com.nopcommerce.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By buildYourComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hddRadio = By.id("product_attribute_3_7");
    By osRadio = By.id("product_attribute_4_9");
    By msOfficeSoftware = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By priceText = By.xpath("//span[@class='price-value-1']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyProductAddedToCart = By.xpath("//*[@id=\"bar-notification\"]/div/p");
    By closeTheBarMsg = By.xpath("//span[@class='close']");
    By mouseHoverOnShoppingCart1 = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCartButton1 = By.xpath("//button[contains(text(),'Go to cart')]");


    public String getTextFromBuildYourComputer() {
        return getTextFromElement(buildYourComputerText);
    }

    public void selectProcessor() {
        selectByValueFromDropDown(processor, "1");
    }

    public void selectRAM() {
        selectByValueFromDropDown(ram, "5");
    }

    public void selectHDDRadio() {
        clickOnElement(hddRadio);
    }

    public void selectOSRadio() {
        clickOnElement(osRadio);
    }

    public void selectSoftwareMS() {
        clickOnElement(msOfficeSoftware);
    }

    public void selectTotalCommander() {
        clickOnElement(totalCommander);
    }

    public String getTextFromPrice() {
        return getTextFromElement(priceText);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String verifyTheProductHasBeenAddedToYourShoppingCart() {
        return getTextFromElement(verifyProductAddedToCart);
    }

    public void closeTheBarByClickingOnTheCrossButton() {
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCartButton() {

        mouseHoverToElement(mouseHoverOnShoppingCart1);
    }

    public void clickOnGoToCartButton() {
        clickOnElement(clickOnGoToCartButton1);
    }


}

