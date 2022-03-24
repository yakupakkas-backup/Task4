package com.task4.POM;

import com.task4.Utilities.BrowserUtils;
import com.task4.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModule(String module) {
        String tabLocator = "//a[@title='" + module + "']";
        WebElement webElement = Driver.get().findElement(By.xpath(tabLocator));
        try {
           BrowserUtils.waitForClickabilility(webElement,5);
            BrowserUtils.clickWithJS(webElement);
        } catch (Exception e) {
                BrowserUtils.clickWithWait(webElement, 5);
        }

    }
}
