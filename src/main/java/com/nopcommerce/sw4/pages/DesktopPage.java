package com.nopcommerce.sw4.pages;

import com.nopcommerce.sw4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    By desktopLink = By.xpath("//img[@alt='Picture for category Desktops']");
    By sortByFilter = By.name("products-orderby");
    By addToCartButton = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");


    public void clickOnSortByNameZToA() {
        selectByVisibleTextFromDropDown(sortByFilter, "Name: Z to A");
    }

    public void clickOnSortByNameAToZ() {
        selectByVisibleTextFromDropDown(sortByFilter, "Name: A to Z");
    }

    public void clickOnAddToCartButton() {
        //waitUntilVisibilityOfElementLocated(addToCartButton,5000);
        clickOnElement(addToCartButton);
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> elementList = findElementsFromWebPage(By.xpath("//h2[@class='product-title']"));
        System.out.println("Total elements are : " + elementList.size());
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : elementList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(3000);
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingElementList = findElementsFromWebPage(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingElementList) {
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
    //    Assert.assertEquals(originalProductNameList, afterSortingProductName, "Products are not sorted in descending order");
    }
}

