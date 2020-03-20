package com.example.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> entries;
    private int count = 0;

    public Journal() {
        entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(++count + ": " + entry);
    }

    public boolean removeEntry(int index) {
        try {
            entries.remove(index);count--;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator() , entries);
    }
}
