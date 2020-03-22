package com.example.solid.dip;

import java.util.List;

class Research {
    public Research(RelationshipBrowser browser, String name) {
        List<Person> children = browser.getChildrensOf(name);
        for (Person child : children)
            System.out.println(name + " has a child called " + child.name);
    }
}