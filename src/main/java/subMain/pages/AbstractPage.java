package subMain.pages;

import org.openqa.selenium.WebDriver;
import subMain.driver.DriverManager;

public abstract class AbstractPage {
  protected WebDriver driver;

  public AbstractPage() {
    this.driver = DriverManager.getDriver();
  }
}
