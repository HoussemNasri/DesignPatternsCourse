package com.example.solid.dip;

import java.util.List;

interface RelationshipBrowser {
    List<Person> getChildrensOf(String name);

    List<Person> getParentsOf(String name);
}