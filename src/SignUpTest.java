import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.applet.Main;

import static java.lang.Thread.sleep;


public class SignUpTest extends BaseTest {

    @BeforeTest
    public void setUp(){
        goToURL("https://staging.engineer.ai/home");
    }

    @Test
    public void login() throws InterruptedException {
        waitForElement(MainPage.tour);
        clickElement(MainPage.tour);
        waitForElement(MainPage.skip);
        sleep(5000);
        clickElement(MainPage.skip);
        waitForElement(MainPage.signUp);
        clickElement(MainPage.signUp);
        clickElement(MainPage.register);
        input(MainPage.emailField, "ssq1@gmail.com");
        clickElement(MainPage.next);
        waitForElement(MainPage.nameField);
        input(MainPage.nameField, "John Johnson");
        input(MainPage.numberField, "+12345678907");
        inputPassword(MainPage.passwordField, "123456789");
        clickElement(MainPage.submit);
        waitForElement(MainPage.done);
        clickElement(MainPage.done);
        Assert.assertTrue(isElementPresent(MainPage.userPanel));
    }

    @AfterTest
    public void postConditionStep() {
        driver.quit();
    }
}
