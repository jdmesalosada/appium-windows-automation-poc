import io.appium.java_client.AppiumDriver;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.jupiter.api.*;
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
    public void sumTest(){

    }

}
