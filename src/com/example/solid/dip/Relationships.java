package com.example.solid.dip;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Relationships implements RelationshipBrowser {
    // Triplet class requires javatuples
    private List<Triplet<Person, Relation, Person>> relations;

    public Relationships() {
        relations = new ArrayList<>();
    }

    public List<Person> getChildrensOf(String name) {

        return relations.stream()
                .filter(x -> Objects.equals(x.getValue0().name, name) && x.getValue1() == Relation.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }


    @Override
    public List<Person> getParentsOf(String name) {

        return relations.stream()
                .filter(e -> e.getValue0().name.equals(name) && e.getValue1() == Relation.CHILD)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }

    public List<Triplet<Person, Relation, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relation.PARENT, child));
        relations.add(new Triplet<>(child, Relation.CHILD, parent));
    }
}
