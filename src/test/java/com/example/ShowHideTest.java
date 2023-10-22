package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class ShowHideTest {

    // Scenario: Click hide button and validate element is hidden 

    @Test
    public void hideShowTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 
        // time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));

        // Assert on page title
        String title = driver.getTitle();
        assertEquals("Practice Page", title);

        // locate hide button
        WebElement buttonElement = driver.findElement(By.id("hide-textbox"));

        // locate hidden element
        WebElement textBoxElement = driver.findElement(By.id("displayed-text"));
        
        // click on hide button
        buttonElement.click();

        // time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));

        // validate element is hidden 
        boolean isThere = textBoxElement.isDisplayed();
        assertEquals(!isThere, true );

        // locate show button
        WebElement showbuttonElement = driver.findElement(By.id("show-textbox"));

        // click on show button
        showbuttonElement.click();

        // validate element is shown 
        isThere = textBoxElement.isDisplayed();
        assertEquals(isThere, true );

        driver.quit();
    }

}
