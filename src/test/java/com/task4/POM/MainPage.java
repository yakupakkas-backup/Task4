package com.task4.POM;

import com.task4.Utilities.BrowserUtils;
import com.task4.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage {
    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womanTab;


    public void navigateToModule(String module) {

        try {
            String tabLocator = "//a[@title='" + module + "']";
            WebElement webElement = Driver.get().findElement(By.xpath(tabLocator));
       //     BrowserUtils.waitForClickabilility(womanTab, 5);
            new Actions(Driver.get()).moveToElement(womanTab).pause(2000).click(womanTab).build().perform();

        } catch (Exception e) {

                String tabLocator = "//a[@title='" + module + "']";
                WebElement webElement = Driver.get().findElement(By.xpath(tabLocator));
                BrowserUtils.clickWithWait(webElement, 5);

        }

    }
}
