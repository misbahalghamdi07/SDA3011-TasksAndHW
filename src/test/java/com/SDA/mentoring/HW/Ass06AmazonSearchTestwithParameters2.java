package com.SDA.mentoring.HW;


import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class Ass06AmazonSearchTestwithParameters2 extends TestBase{

    //        Task 1: Amazon Search Test with Parameters
//        Objective: Create parameterized test for Amazon search functionality
//        Requirements:
//        1. Navigate to: https://www.amazon.com
//        2. Search for different keywords: Java, Selenium
//        3. Assert that result text contains the searched word
//        4. Run tests from XML file using parameters


@Test
    @Parameters("keyword")
    public void longinTest(@Optional("keyword")String keyword){

    driver.get("https://www.amazon.com");

    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(keyword);
    driver.findElement(By.id("nav-search-submit-button")).click();

    WebElement resultText = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
    String actualText = resultText.getText();


    Assert.assertTrue(actualText.toLowerCase().contains(keyword.toLowerCase()), "It's not the same ");





}

}
