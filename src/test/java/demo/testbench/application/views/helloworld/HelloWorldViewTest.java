package demo.testbench.application.views.helloworld;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.testbench.unit.SpringUIUnitTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldViewTest extends SpringUIUnitTest {
    @Test
    public void setText_clickButton_notificationIsShown() {
        final HelloWorldView helloView = navigate(HelloWorldView.class);

        helloView.helloTest();

        test(helloView.name).setValue("Marvin");
        test(helloView.sayHello).click();

        Notification notification = $(Notification.class).first();
        Assertions.assertEquals("Hello Marvin", test(notification).getText());


    }

    @Test
    public void textBackend() {

    }
}

