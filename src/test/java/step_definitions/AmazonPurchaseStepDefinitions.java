package step_definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import uk.kainos.seleniumframework.driver.DriverManager;
import uk.kainos.seleniumframework.site.pageobjects.AmazonHomePage;

public class AmazonPurchaseStepDefinitions {
    private final String AMAZON_HOME_PAGE = "https://www.amazon.co.uk";
    protected WebDriver driver = DriverManager.getDriver();

    @Given("^the client is on Amazon home page$")
    public AmazonPurchaseStepDefinitions theClientOpenAmazonHomePage() {
        driver.navigate().to(AMAZON_HOME_PAGE);
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.acceptCookies();
        return this;
    }
}
