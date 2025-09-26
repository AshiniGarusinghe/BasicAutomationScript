package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementInformationCommands {
    public static void  main(String[]args) throws InterruptedException{
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bing.com/");
        driver.findElement(By.name("q")).sendKeys("iphone shops in sri lanka");
        driver.findElement(By.name("q")).submit();
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.cssSelector("[class='b_maglistcard'] h2"));
        List<WebElement> elementsLinks = driver.findElements(By.cssSelector("[class='bm_details_overlay'] a"));
        if(elements.size() == elementsLinks.size()){
            for(int i = 0; i < elements.size(); i++){
                System.out.println(elements.get(i).getText());
                System.out.println(elementsLinks.get(i).getAttribute("href"));
            }


        }
    }
}
