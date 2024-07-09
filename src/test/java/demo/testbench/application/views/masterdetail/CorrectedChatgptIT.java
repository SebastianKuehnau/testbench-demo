package demo.testbench.application.views.masterdetail;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.flow.component.notification.testbench.NotificationElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.BrowserTest;
import com.vaadin.testbench.BrowserTestBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CorrectedChatgptIT extends BrowserTestBase {

//    @Test
    @BrowserTest
    public void cancelEdit() {
        getDriver().get("http://localhost:8080/master-detail");

        GridElement grid = $(GridElement.class).first();
        grid.getCell(0, 0).click();

//        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-text-field")));
        waitUntil(driver -> $(TextFieldElement.class).exists(), 10);

        TextFieldElement firstNameField = $(TextFieldElement.class).id("firstName");
        firstNameField.setValue("Jane");

        ButtonElement cancelButton = $(ButtonElement.class).id("cancel");
        cancelButton.click();

//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-grid")));
        waitUntil(driver -> $(GridElement.class).exists(), 10);

        grid = $(GridElement.class).first();
        grid.getCell(0, 0).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-text-field")));
        waitUntil(driver -> $(TextFieldElement.class).exists(), 10);

        firstNameField = $(TextFieldElement.class).id("firstName");
        Assertions.assertNotEquals("Jane", firstNameField.getValue());
    }

}
