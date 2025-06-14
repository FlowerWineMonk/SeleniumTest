package subMain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubeSearchResultPage extends AbstractPage {
  @FindBy(css = "ytd-video-renderer a#video-title")
  private WebElement firstVideo;

  public YoutubeSearchResultPage() {
    super();
    PageFactory.initElements(driver, this);
  }

  public void clickFirstVideo() {
    waitForVisibilityAndClick(firstVideo);
  }
}

