package demo.testbench.application.views.masterdetail;

import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.BrowserTest;
import com.vaadin.testbench.BrowserTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class MasterDetailViewIT extends BrowserTestBase {

    @BeforeEach
    public void setup() throws Exception {
        // Open the application
        getDriver().get("http://localhost:8080/master-detail/3/edit");
    }

    @BrowserTest
    public void selectedItem() {
        GridElement grid = $(GridElement.class).first();

        Assertions.assertTrue(grid.getRow(2).isSelected());

        TextFieldElement name = $(TextFieldElement.class).first();

        Assertions.assertEquals("Eugenia", name.getValue());
    }
}
