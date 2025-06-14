package subMain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    waitForVisibilityAndSendKeys(searchInput, query);
    waitForVisibilityAndClick(searchButton);
  }

  public void signInBtnClick() {
    waitForVisibilityAndClick(signInBtn);
  }
}
