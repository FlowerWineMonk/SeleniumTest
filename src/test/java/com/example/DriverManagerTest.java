package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class DriverManagerTest {
  private WebDriver driver;
  static final String VENTION_PATH_LOCATOR = "//div[@class='sc-a0fab475-0 huvLO']";

  @BeforeMethod
  public void BeforeMethod() {
    driver = DriverManager.getDriver();
  }

  @AfterMethod
  public void AfterMethod() {
    if(driver != null) {
      driver.quit();
    }
  }

  @Test
  public void testOpenVentionTeams() {
    driver.get("https://ventionteams.com/");
    WebElement searchIcon = driver.findElement(By.xpath(VENTION_PATH_LOCATOR));
    searchIcon.click();
  }
}
