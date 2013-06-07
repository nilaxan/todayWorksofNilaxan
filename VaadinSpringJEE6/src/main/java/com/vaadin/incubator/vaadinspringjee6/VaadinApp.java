package com.vaadin.incubator.vaadinspringjee6;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "vaadinApp")
@Scope(value = "session")
public class VaadinApp extends Application {

    @Autowired
    private GreetingView greetingView;

    @Override
    public void init() {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSizeFull();
        Label header = new Label("My Vaadin Application");
        header.setStyleName("h1");
        layout.addComponent(header);

        TabSheet tabs = new TabSheet();
        tabs.setSizeFull();
        layout.addComponent(tabs);
        layout.setExpandRatio(tabs, 1);

        tabs.addTab(greetingView);

        Window mainWindow = new Window("My Vaadin Application", layout);
        setMainWindow(mainWindow);
    }
}
