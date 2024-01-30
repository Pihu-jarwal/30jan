package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(33));
        driver.navigate().to("https://kabbaniblackhat-295540-react.b295540.uat.eastus.az.svc.builder.ai/TaskList/47");
    }
}