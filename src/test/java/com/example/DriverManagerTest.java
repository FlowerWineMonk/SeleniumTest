package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class DriverManagerTest {
  private WebDriver driver;
  static final String YOUTUBE_SEARCH_INPUT_LOCATOR = "//input[@name='search_query']";
  static final String YOUTUBE_SEARCH_BUTTON_LOCATOR = "//button[@aria-label='Search']";

  @BeforeMethod
  public void BeforeMethod() {
    driver = DriverManager.getDriver();
  }

//  @AfterMethod
//  public void AfterMethod() {
//    if(driver != null) {
//      driver.quit();
//    }
//  }

  @Test
  public void testOpenVentionTeams() {
    driver.get("https://www.youtube.com");
    WebElement searchInput = driver.findElement(By.xpath(YOUTUBE_SEARCH_INPUT_LOCATOR));
    WebElement searchButton = driver.findElement(By.xpath(YOUTUBE_SEARCH_BUTTON_LOCATOR));
    searchInput.sendKeys("Zoku Owarimonogatari : shots and ambiances");
    searchButton.click();


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement firstVideo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ytd-video-renderer a#video-title")));
    firstVideo.click();
  }
}
