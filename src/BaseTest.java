import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BaseTest {

    public static WebDriver driver;
    private static ChromeDriverService service;
    public static WebDriverWait wait;
    private final static String PATH_TO_CHROMEDRIVER = "driver/chromedriver.exe";


    public BaseTest() {
        try {
            service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File(PATH_TO_CHROMEDRIVER))
                    .usingAnyFreePort()
                    .build();
            service.start();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("...", true);
            ChromeOptions option = new ChromeOptions();

            driver = new RemoteWebDriver(service.getUrl(), option);
            driver.manage().timeouts().implicitlyWait(20, SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, SECONDS);
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 20);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToURL(String url) {
        driver.get(url);
    }

    public void clickElement (String element){
        driver.findElement(By.xpath(element)).click();
    }

    public void input(String element, String text){
        driver.findElement(By.xpath(element)).sendKeys(text);
    }

    public void inputPassword (String element, String password){
        driver.findElement(By.cssSelector(element)).sendKeys(password);
    }

    public void moveToElement(String elementLocation) {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath(elementLocation))).build().perform();
    }

    public void waitForElement(String element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }

    public boolean isElementHasClass(String elementLocation, String active) {
        return driver.findElement(By.xpath(elementLocation)).
                findElements(By.xpath(".//*[contains(@class,'"+active+"')]")).size() > 0;
    }

    public boolean isElementPresent(String elementLocation) {
        try {
            driver.findElement(By.xpath(elementLocation));
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
