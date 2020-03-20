package com.example.solid.isp;

public class MultiFunctionPrinter implements DocumentPrinter, DocumentFaxer, DocumentScanner {
    @Override
    public void fax(Document document) {
        System.out.println("Faxed using multi function  printer");
    }

    @Override
    public void print(Document document) {
        System.out.println("<MultiFunctionPrinter>");
        System.out.println("title : " + document.getTitle());
        System.out.println("Content : " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanned using multi function  printer");
    }
}
