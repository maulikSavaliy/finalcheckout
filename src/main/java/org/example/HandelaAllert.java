package org.example;

import org.openqa.selenium.By;

public class HandelaAllert extends Utils {
    // create one methode for click on search button
    public void handleaSearchButtonAllert() {
        // use a reusable method for click
        clickOnElement(By.cssSelector("button.button-1.search-box-button"));
        //Syntex for accept allert
        driver.switchTo().alert().accept();
    }

    // create a methode for click on community poll in home page and accept allert
    public void handelacommunitypollAller() {
        //click on community pollbutton by usr of cssselector webelement
        clickOnElement(By.cssSelector("button#vote-poll-1"));
        driver.switchTo().alert().accept();
    }
}
