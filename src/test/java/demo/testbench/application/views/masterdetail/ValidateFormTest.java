package demo.testbench.application.views.masterdetail;

//@TestBenchTest
//public class ValidateFormTest extends TestBenchTestCase {
//
//    @Test
//    public void validateForm() {
//        getDriver().get("http://localhost:8080/master-detail");
//
//        GridElement grid = $(GridElement.class).first();
//        grid.getCell(0, 0).click();
//
//        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-text-field")));
//
//        TextFieldElement emailField = $(TextFieldElement.class).id("email");
//        emailField.setValue("invalid-email");
//
//        ButtonElement saveButton = $(ButtonElement.class).id("save");
//        saveButton.click();
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("v-notification-caption")));
//        Assert.assertTrue($(NotificationElement.class).first().getText().contains("Failed to update the data"));
//    }
//}
