package subMain.pages;

import subMain.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubeHomePage extends AbstractPage {
  private static final String YOUTUBE_SEARCH_INPUT_LOCATOR = "//input[@name='search_query']";
  private static final String YOUTUBE_SEARCH_BUTTON_LOCATOR = "//button[@aria-label='Search']";

  @FindBy(xpath = YOUTUBE_SEARCH_INPUT_LOCATOR)
  private WebElement searchInput;

  @FindBy(xpath = YOUTUBE_SEARCH_BUTTON_LOCATOR)
  private WebElement searchButton;

  public YoutubeHomePage() {
    super();
    PageFactory.initElements(driver, this);
  }

  public void searchFor(String query) {
    searchInput.sendKeys(query);
    searchButton.click();
  }
}
