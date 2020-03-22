package com.example.solid.dip;

class DIPDemo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person mother = new Person("Maria");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        // low-level module
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);
        relationships.addParentAndChild(mother, child1);
        relationships.addParentAndChild(mother, child2);

        new Research(relationships, "Maria");
    }
}