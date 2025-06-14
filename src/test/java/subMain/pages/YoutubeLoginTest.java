package subMain.pages;

import subMain.driver.DriverManager;
import subMain.configLoader.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeLoginTest {
  @BeforeMethod
  public void setUp() {
    DriverManager.initDriver();
    WebDriver driver = DriverManager.getDriver();
    driver.get("https://www.youtube.com");
  }

  @AfterMethod
  public void tearDown() {
    DriverManager.quitDriver();
  }

  @Test
  public void testSignInBtn() {
    YoutubeHomePage homePage = new YoutubeHomePage();
    homePage.signInBtnClick();

    SignInPage signInPage = new SignInPage();
    String email = ConfigLoader.get("email");
    signInPage.enterEmailAndProceed(email);
  }
}

