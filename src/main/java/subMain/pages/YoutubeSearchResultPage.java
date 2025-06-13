package subMain.pages;

import subMain.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YoutubeSearchResultPage extends AbstractPage {
  @FindBy(css = "ytd-video-renderer a#video-title")
  private WebElement firstVideo;

  public YoutubeSearchResultPage() {
    super();
    PageFactory.initElements(driver, this);
  }

  public void clickFirstVideo() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(firstVideo));
    firstVideo.click();
  }
}

