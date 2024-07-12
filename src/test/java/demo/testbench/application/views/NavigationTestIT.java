package demo.testbench.application.views;

import com.vaadin.testbench.BrowserTest;
import com.vaadin.testbench.BrowserTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class NavigationTestIT extends BrowserTestBase {

    @BeforeEach
    public void setup() {
        // Open the application
        getDriver().get("http://localhost:8080/");
    }

    // Please note that since TestBench 9 test methods
    // must be annotated with helper @BrowserTest annotation.
    @BrowserTest
    public void clickButton() {

            Assertions.assertEquals(getDriver().getTitle(), "Hello World");

            getDriver().navigate().to("http://localhost:8080/master-detail");

            Assertions.assertEquals(getDriver().getTitle(), "Master-Detail");

            getDriver().navigate().back();

            Assertions.assertEquals(getDriver().getTitle(), "Hello World");
    }
}
