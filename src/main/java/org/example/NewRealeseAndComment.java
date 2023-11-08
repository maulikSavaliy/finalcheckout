package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewRealeseAndComment extends Utils
{
    public String expectedresult = "nopCommerce includes everything you need to begin your e-commerce online store. We have thought of everything and it's all included!";

    public void clickOnNonCommerceNewRealese()
    {
        clickOnElement(By.xpath("//a[text()='nopCommerce new release!']"));
        //Assert.assertEquals(getTextFromElement(By.xpath("//div[@class=\"news-body\"]/p")),expectedresult);

        String actualresult=getTextFromElement(By.xpath("//div[@class=\"news-body\"]/p"));

        Assert.assertEquals(actualresult,expectedresult);
        // enter value in title
        enterValueinElement(By.cssSelector("input.enter-comment-title"),"cell phone ");

        // enter a comment
        enterValueinElement(By.cssSelector("textarea.enter-comment-text"),"add a new model of cellphone");
         // click on newcomment
        clickOnElement(By.xpath("//button[text()='New comment']"));

        Assert.assertEquals(getTextFromElement(By.cssSelector("div.result")),"News comment is successfully added...");
    }
}
