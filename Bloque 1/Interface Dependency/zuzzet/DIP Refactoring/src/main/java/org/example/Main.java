package org.example;
public class Main {
    public static void main(String[] args) {
        DocumentCreator documentCreator = AppConfig.generateDocumentGenerator();
        documentCreator.generateDocument();



    }
}