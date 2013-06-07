package com.vaadin.incubator.vaadinspringjee6;

import com.vaadin.incubator.vaadinspringjee6.services.GreetingServiceBean;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session")
public class GreetingView extends CustomComponent {

    @EJB
    GreetingServiceBean greetingService;

    @PostConstruct
    public void init() {
        setCaption("Greetings");
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSizeFull();

        final TextField nameField = new TextField("What is your name?");
        final Label greetingLbl = new Label();
        layout.addComponent(nameField);
        layout.addComponent(new Button("Say Hello", new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                greetingLbl.setCaption(greetingService.sayHello(nameField.getValue().toString()));
            }
        }));
        layout.addComponent(greetingLbl);

        setCompositionRoot(layout);
    }
}
