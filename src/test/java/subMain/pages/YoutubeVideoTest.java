package subMain.pages;

import subMain.driver.DriverManager;
import subMain.pages.YoutubeHomePage;
import subMain.pages.YoutubeSearchResultPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeVideoTest {
  @BeforeMethod
  public void BeforeMethod() {
    DriverManager.initDriver();
    WebDriver driver = DriverManager.getDriver();
    driver.get("https://www.youtube.com");
  }

  @AfterMethod
  public void AfterMethod() {
    DriverManager.quitDriver();
  }

  @Test
  public void testOpenVentionTeams() {
    YoutubeHomePage homePage = new YoutubeHomePage();
    homePage.searchFor("Zoku Owarimonogatari : shots and ambiances");

    YoutubeSearchResultPage resultPage = new YoutubeSearchResultPage();
    resultPage.clickFirstVideo();
  }
}
