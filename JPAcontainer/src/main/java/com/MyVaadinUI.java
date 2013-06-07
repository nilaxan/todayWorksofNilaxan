package com;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.*;

/**
 * The Application's "main" class
 *
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{
       private Table cometTable;
       private FormLayout form;

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);
        

        BeanItemContainer<Comet> comets = new BeanItemContainer<Comet>(Comet.class);

        comets.addBean(new Comet(1, "Halley","colombo",25,"halley@gmail.com","0771758666"));
        comets.addBean(new Comet(2, "Halley","colombo",25,"halley@gmail.com","0771758666"));
        comets.addBean(new Comet(3, "Halley","colombo",25,"halley@gmail.com","0771758666"));
        comets.addBean(new Comet(4, "Halley","colombo",25,"halley@gmail.com","0771758666"));
        comets.addBean(new Comet(5, "Halley","colombo",25,"halley@gmail.com","0771758666"));



        Table cometTable = new Table("The Employee Details", comets);
        layout.addComponent(cometTable);

}
}