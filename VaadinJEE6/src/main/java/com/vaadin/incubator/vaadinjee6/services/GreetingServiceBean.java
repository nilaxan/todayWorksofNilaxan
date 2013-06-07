package com.vaadin.incubator.vaadinjee6.services;

import javax.ejb.Stateless;

@Stateless
public class GreetingServiceBean {

    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

}
