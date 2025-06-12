package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class DriverManagerTest {
  private WebDriver driver;
  static final String YOUTUBE_SEARCH_INPUT_LOCATOR = "//input[@name='search_query']";

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
    driver.get("https://www.youtube.com");
    WebElement searchInput = driver.findElement(By.xpath(YOUTUBE_SEARCH_INPUT_LOCATOR));
    searchInput.sendKeys("Zoku Owarimonogatari : shots and ambiances");
    searchInput.submit();
  }
}
