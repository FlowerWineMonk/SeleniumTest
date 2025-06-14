package subMain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    waitForVisibilityAndSendKeys(signInBox, email);
    waitForVisibilityAndClick(nextButton);
  }
}
