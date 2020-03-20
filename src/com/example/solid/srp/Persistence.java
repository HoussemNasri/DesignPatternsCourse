package com.example.solid.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Persistence<T> {
    public void saveToFile(T t, String fileName, boolean overwrite) throws FileNotFoundException {
        if (overwrite || !new File(fileName).exists()) {
            try (PrintStream printStream = new PrintStream(fileName)) {
                printStream.print(t.toString());
            }
        }
    }

    public void loadFromFile(String fileName) throws IOException {
        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }
}
