package demo.testbench.application.views.masterdetail;

//@TestBenchTest
//public class EditItemTest extends TestBenchTestCase {
//
//    @Test
//    public void editItem() {
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
//        ButtonElement saveButton = $(ButtonElement.class).id("save");
//        saveButton.click();
//
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("v-notification-caption"), "Data updated"));
//
//        grid = $(GridElement.class).first();
//        Assert.assertEquals("Jane", grid.getCell(0, 0).getText());
//    }
//}