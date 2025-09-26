package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ElementInteractionCommands {
    public static void  main(String[]args) throws InterruptedException{
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bing.com/");
        driver.findElement(By.name("q")).sendKeys("iphone shops in sri lanka");
        driver.findElement(By.name("q")).submit();
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.cssSelector("[class='b_maglistcard'] h2"));
        for(WebElement element : elements){
            System.out.println(element.getText());
        }

    }
}
