package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameCommands {
    public static void main(String[] args){
        singleFrameTest();

    }

    public static void singleFrameTest(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
        driver.switchTo().frame("singleframe");
        driver.findElement(By.cssSelector("input")).sendKeys("test");
        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());

    }
}
