package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

// import static org.junit.Assert.assertEquals;

public class RadioButtonTest {

    // Scenario: Click on radio button 3 and validate that only 1 radio button is checked, Click on Radio button 2 and validate that button 2 is the only checked button
    
    @Test
    public void radioButton() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 
        // time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));

        // Assert on page title
        String title = driver.getTitle();
        assertEquals("Practice Page", title);

        // Click on radio button 3 and validate that only 1 radio button is checked

        // locate radio button 3
        WebElement radButtonElement3 = driver.findElement(By.xpath("//input[@value='radio3']"));
        
        // click on radio button 3
        radButtonElement3.click();

        // locate radio button 1
        WebElement radButtonElement = driver.findElement(By.xpath("//input[@value='radio1']"));

        // locate radio button 2
        WebElement radButtonElement2 = driver.findElement(By.xpath("//input[@value='radio2']"));

        // check if radio button 1 is selected     
        boolean isChecked = radButtonElement.isSelected();
        assertEquals(isChecked, false );

        // check if radio button 2 is selected     
        isChecked = radButtonElement2.isSelected();
        assertEquals(isChecked, false );

        // check if radio button 3 is selected     
        isChecked = radButtonElement3.isSelected();
        assertEquals(isChecked, true );

        // Click on Radio button 2 and validate that button 2 is the only checked button

        // click on radio button 2
        radButtonElement2.click();

        // check if radio button 1 is selected     
        isChecked = radButtonElement.isSelected();
        assertEquals(isChecked, false );

        // check if radio button 2 is selected     
        isChecked = radButtonElement2.isSelected();
        assertEquals(isChecked, true );

        // check if radio button 3 is selected     
        isChecked = radButtonElement3.isSelected();
        assertEquals(isChecked, false );

        driver.quit();
    }

}
