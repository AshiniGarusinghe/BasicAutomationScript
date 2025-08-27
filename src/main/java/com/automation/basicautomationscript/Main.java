package com.automation.basicautomationscript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("gh-ac")).click();
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("iphone");


        new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Cell Phones & Accessories");

        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);


    }
}
