package demo.testbench.application.views.masterdetail;

//@TestBenchTest
//public class SelectItemInGridTest extends TestBenchTestCase {
//
//    @Test
//    public void selectItemInGrid() {
//        getDriver().get("http://localhost:8080/master-detail");
//
//        GridElement grid = $(GridElement.class).first();
//        grid.getCell(0, 0).click();
//
//        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("vaadin-text-field")));
//
//        TextFieldElement firstNameField = $(TextFieldElement.class).id("firstName");
//        Assert.assertEquals("First name value is not as expected", "John", firstNameField.getValue());
//    }
//}