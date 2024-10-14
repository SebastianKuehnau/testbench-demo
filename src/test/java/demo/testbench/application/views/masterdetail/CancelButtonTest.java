package demo.testbench.application.views.masterdetail;

//@TestBenchTest
//public class CancelButtonTest extends TestBenchTestCase {
//
//    @Test
//    public void cancelEdit() {
//        getDriver().get("http://localhost:8080/master-detail");
//
//        GridElement grid = $(GridElement.class).first();
//        grid.getCell(0, 0).click();
//
//        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-text-field")));
//
//        TextFieldElement firstNameField = $(TextFieldElement.class).id("firstName");
//        firstNameField.setValue("Jane");
//
//        ButtonElement cancelButton = $(ButtonElement.class).id("cancel");
//        cancelButton.click();
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-grid")));
//
//        grid = $(GridElement.class).first();
//        grid.getCell(0, 0).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-text-field")));
//
//        firstNameField = $(TextFieldElement.class).id("firstName");
//        Assert.assertNotEquals("Jane", firstNameField.getValue());
//    }
//}
