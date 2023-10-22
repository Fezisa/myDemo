package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class CheckboxTest {

    // Scenario: Check all checkboxes, validate all are checked then uncheck first checkbox and validate the rest are checked
    
    @Test
    public void chkBoxCheck() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 
        // time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));

        // Assert on page title
        String title = driver.getTitle();
        assertEquals("Practice Page", title);

        // Check all checkboxes, validate all are checked

        // locate checkbox 1
        WebElement chkBoxElement = driver.findElement(By.id("checkBoxOption1"));

        // locate checkbox 2
        WebElement chkBoxElement2 = driver.findElement(By.id("checkBoxOption2"));
        
        // locate checkbox 3
        WebElement chkBoxElement3 = driver.findElement(By.id("checkBoxOption3"));

        // click on checkbox 1
        chkBoxElement.click();

        // click on checkbox 2
        chkBoxElement2.click();

        // click on checkbox 3
        chkBoxElement3.click();

        // check if checkbox 1 is selected     
        boolean isChecked = chkBoxElement.isSelected();
        assertEquals(isChecked, true );

        // check if checkbox 2 is selected     
        isChecked = chkBoxElement2.isSelected();
        assertEquals(isChecked, true );

        // check if checkbox 3 is selected     
        isChecked = chkBoxElement3.isSelected();
        assertEquals(isChecked, true );

        // Uncheck first checkbox and validate the rest are checked

        // click on checkbox 1
        chkBoxElement.click();

        // check if checkbox 2 is selected     
        isChecked = chkBoxElement2.isSelected();
        assertEquals(isChecked, true );

        // check if checkbox 3 is selected     
        isChecked = chkBoxElement3.isSelected();
        assertEquals(isChecked, true );

        driver.quit();
    }

}
