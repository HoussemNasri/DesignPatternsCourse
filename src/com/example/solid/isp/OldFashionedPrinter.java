package com.example.solid.isp;

public class OldFashionedPrinter implements DocumentPrinter {
    @Override
    public void print(Document document) {
        System.out.println("<OldFashionedPrinter>");
        System.out.println("title : " + document.getTitle());
        System.out.println("Content : " + document.getContent());
    }
}
