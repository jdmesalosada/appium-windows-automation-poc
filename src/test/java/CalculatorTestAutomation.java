
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class CalculatorTestAutomation {

    private static AppiumDriver driver;

    @BeforeEach
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        caps.setCapability("platformName", "windows");
        caps.setCapability("automationName", "windows");

        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
    }

    @AfterEach
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ign) {}
    }

    @Test
    public void sumTest() throws InterruptedException {
        //Thread.sleep(3000);

        WebElement maximize = driver.findElement(AppiumBy.accessibilityId("Maximize"));
        maximize.click();

        Thread.sleep(3000);
    }

    @Test
    public void sumTest2() throws InterruptedException {
        WebElement num2 = driver.findElement(AppiumBy.accessibilityId("num2Button"));
        num2.click();

        WebElement plusButton = driver.findElement(AppiumBy.accessibilityId("plusButton"));
        plusButton.click();

        num2.click();

        WebElement equalButton = driver.findElement(AppiumBy.accessibilityId("equalButton"));
        equalButton.click();

        WebElement calculatorResults = driver.findElement(AppiumBy.accessibilityId("CalculatorResults"));
        String resultText = calculatorResults.getText();

        Assertions.assertEquals("Se muestra 4", resultText);

        Thread.sleep(3000);
    }
}
