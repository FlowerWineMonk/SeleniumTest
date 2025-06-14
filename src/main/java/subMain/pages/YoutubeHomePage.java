package subMain.pages;

import subMain.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class YoutubeHomePage extends AbstractPage {
  private static final String YOUTUBE_SEARCH_INPUT_LOCATOR = "//input[@name='search_query']";
  private static final String YOUTUBE_SEARCH_BUTTON_LOCATOR = "//button[@aria-label='Search']";
  private static final String YOUTUBE_SIGN_IN_BTN_LOCATOR = "//a[@aria-label='Sign in']";

  @FindBy(xpath = YOUTUBE_SEARCH_INPUT_LOCATOR)
  private WebElement searchInput;

  @FindBy(xpath = YOUTUBE_SEARCH_BUTTON_LOCATOR)
  private WebElement searchButton;

  @FindBy(xpath = YOUTUBE_SIGN_IN_BTN_LOCATOR)
  private WebElement signInBtn;

  public YoutubeHomePage() {
    super();
    PageFactory.initElements(driver, this);
  }

  public void searchFor(String query) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(searchInput));
    wait.until(ExpectedConditions.elementToBeClickable(searchInput));

    searchInput.sendKeys(query);

    wait.until(ExpectedConditions.elementToBeClickable(searchButton));
    searchButton.click();
  }

  public void signInBtnClick() {
    signInBtn.click();
  }
}
