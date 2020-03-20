package com.example.solid.isp;

public class ISPDemo {

    public static void main(String[] args) {
        Document document = new Document("My Document", "welcome to my document");

        MultiFunctionPrinter multiPrinter = new MultiFunctionPrinter();
        multiPrinter.print(document);

        System.out.println();

        OldFashionedPrinter oldPrinter = new OldFashionedPrinter();
        oldPrinter.print(document);


    }
}
