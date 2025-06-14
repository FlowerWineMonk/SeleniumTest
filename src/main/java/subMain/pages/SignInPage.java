package subMain.pages;

import subMain.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage extends AbstractPage {
  private static final String INPUT_BOX = "//input[@type='email']";
  private static final String NEXT_BUTTON = "//span[text()='Next']/ancestor::button";

  @FindBy(xpath = INPUT_BOX)
  private WebElement signInBox;

  @FindBy(xpath = NEXT_BUTTON)
  private WebElement nextButton;

  public SignInPage() {
    super();
    PageFactory.initElements(driver, this);
  }

  public void enterEmailAndProceed(String email) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.visibilityOf(signInBox));
    signInBox.sendKeys(email);

    wait.until(ExpectedConditions.elementToBeClickable(nextButton));
    nextButton.click();
  }
}
