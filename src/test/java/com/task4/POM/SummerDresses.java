package com.task4.POM;

import com.task4.Utilities.BrowserUtils;
import com.task4.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.WeakHashMap;

public class SummerDresses {

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]/span")
    public WebElement printedChiffonDressAtcElement;

    public void addToCart(WebElement webElement) throws InterruptedException {

        try {
            BrowserUtils.waitForClickabilility(webElement, 5);

        } catch (Exception e) {
//                BrowserUtils.clickWithWait(webElement, 5);

                JavascriptExecutor js = (JavascriptExecutor) Driver.get();
                js.executeScript("arguments[0].scrollIntoView();", webElement);

            }


        System.out.println("Cart: " + Driver.get().findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")).getText());





    }


}
