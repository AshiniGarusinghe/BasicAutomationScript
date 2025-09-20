package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationCommands {
    public static void main(String[]args){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.navigate().back();
        System.out.println("Go back");
        driver.navigate().forward();
        System.out.println("Go forward");
        driver.navigate().refresh();
        System.out.print("Refresh");
    }
}
