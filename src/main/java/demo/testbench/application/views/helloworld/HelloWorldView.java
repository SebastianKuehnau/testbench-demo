package demo.testbench.application.views.helloworld;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import demo.testbench.application.views.MainLayout;
import org.jboss.logging.Logger;

@PageTitle("Hello World")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    private final Logger logger = Logger.getLogger(HelloWorldView.class);

    TextField name;
    Button sayHello;

    public HelloWorldView() {
        name = new TextField("Your name");
        name.setId("name-field");

        name.addValueChangeListener(event -> {
            logger.info("event.isFromClient() " + event.isFromClient());
            logger.info("event.getValue() " + event.getValue());
        });
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
    }

}
