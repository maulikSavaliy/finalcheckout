package org.example;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Utils extends BasePage
{
    //create a one reusable methode
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    // creat reusable method fot selectwithindex with perameter
    public void selectElementwithIndex(By by,int value)
    {
        //create boject gor inbuilt select class
        Select select=new Select(driver.findElement(by));
        select.selectByIndex(value);
    }
    //create reusable methode for get text
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    // create reusable method foe enter a value
    public void enterValueinElement(By by ,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    // create a timestamp for reusable method
    public String  timeStamp()
    {
       String timeStamp=new SimpleDateFormat("yyyymmddhhmmss").format(new java.util.Date());
       return timeStamp;
    }

    // create a select methode for reusable
    public void selectByText(By by,String text)
    {
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    // create a methode for screenshot
    public void takeAScreenShot(String screenshorname)
    {
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File soure=takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(soure,new File("ScreenshotAs\\"+screenshorname+timeStamp()+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
