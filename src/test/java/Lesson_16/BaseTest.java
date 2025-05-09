package Lesson_16;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePageMts homePageMts;
    protected SelectService serviceForm;
    protected PaymentFrame paymentFrame;

    protected static final String TEST_PHONE_NUMBER = "297777777";
    protected static final String TEST_SUM = "10";
    protected static final String TEST_EMAIL = "test@example.com";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--disable-blink-features=AutomationControlled",
                "--start-maximized",
                "--disable-notifications"
        );
        this.driver = new ChromeDriver(options);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        this.homePageMts = new HomePageMts(driver);
        this.serviceForm = new SelectService(driver);
        this.paymentFrame = new PaymentFrame(driver);

        driver.get("https://www.mts.by");
        acceptCookies();
        prepareTest();
    }

    protected void prepareTest() {
        driver.navigate().refresh();
    }

    protected void acceptCookies() {
        try {
            WebElement cookieAccept = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(., 'Принять') or contains(., 'Согласен')]")));
            cookieAccept.click();
            wait.until(ExpectedConditions.invisibilityOf(cookieAccept));
        } catch (Exception e) {
            System.out.println("Cookie banner not found or already closed: " + e.getMessage());
        }
    }

    protected void preparePaymentForm(String serviceType, String phone, String amount) {
        serviceForm.selectService(serviceType);
        homePageMts.fillPhoneNumber(phone);
        homePageMts.fillAmount(amount);
        homePageMts.clickContinueButton();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().defaultContent();
    }
}
