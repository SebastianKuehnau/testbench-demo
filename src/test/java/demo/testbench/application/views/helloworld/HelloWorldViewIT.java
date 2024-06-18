package demo.testbench.application.views.helloworld;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.notification.testbench.NotificationElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.vaadin.testbench.BrowserTest;
import com.vaadin.testbench.BrowserTestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HelloWorldViewIT extends BrowserTestBase {

    @BeforeEach
    public void setup() throws Exception {
        // Open the application
        getDriver().get("http://localhost:8080/");
    }

    // Please note that since TestBench 9 test methods
    // must be annotated with helper @BrowserTest annotation.
    @BrowserTest
    public void clickButton() throws InterruptedException {
        //find text field according to id and set value to marvin
        TextFieldElement textField = $(TextFieldElement.class).id("name-field");
        textField.setValue("Marvin");

        // Find the first button (<vaadin-button>) on the page and click it
        ButtonElement button = $(ButtonElement.class).first();
        button.click();

        //fetch notification element
        NotificationElement notificationElement = $(NotificationElement.class).first();

        //make the checks
        Assertions.assertEquals("Say hello", button.getText());
        Assertions.assertEquals("Your name", textField.getText());

        Assertions.assertTrue(notificationElement.isOpen());
        Assertions.assertEquals("Hello Marvin", notificationElement.getText());

        Thread.sleep(5000);

        Assertions.assertFalse(notificationElement.isOpen());
    }
}