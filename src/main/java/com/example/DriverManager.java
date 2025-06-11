package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManager {
  private static WebDriver driver;

  private DriverManager() {}

  public static WebDriver getDriver() {
    if (driver == null) {
//      ChromeOptions options = new ChromeOptions();
//      options.setBinary("/opt/brave-bin/brave");
//      driver = new ChromeDriver(options);
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    return driver;
  }
}
