package org.example;

import org.openqa.selenium.By;

import java.util.Scanner;

public class SearchProduct extends Utils
{
    public String name ="Nike";
    public void clickonSearchBox()
    {
        Scanner scanner=new Scanner(System.in);

        // click on search box
        clickOnElement(By.cssSelector("input#small-searchterms"));

        //name=scanner.nextLine();
        // enter a value of item
        enterValueinElement(By.cssSelector("input#small-searchterms"),name);

        //click on search button
        clickOnElement(By.cssSelector("button.button-1.search-box-button"));

    }

}
