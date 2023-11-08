package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest extends Browsermanager
{
    @BeforeMethod
    public void startBrowser()
    {
     openBrowser();
    }
    @AfterMethod
    public void endBrowser(ITestResult result)
    {
        if (!(result.isSuccess()))
        {
          takeAScreenShot(result.getName()+timeStamp());
        }

        closeBrowser();
    }
}

