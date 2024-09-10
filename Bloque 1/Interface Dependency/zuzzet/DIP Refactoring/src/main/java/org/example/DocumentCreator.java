package org.example;

public class DocumentCreator {
    private InputReader inputReader;
    private FileCreatorRegistry registry;

    public DocumentCreator(InputReader inputReader, FileCreatorRegistry registry) {
        this.inputReader = inputReader;
        this.registry = registry;
    }

    public void generateDocument() {
        String content = inputReader.readInput("Ingresa el contenido de tu archivo");
        String filename = inputReader.readInput("Ingresa el nombre del arhivo (sin espacios) del archivo");
        String fileType = inputReader.readInput("Escoge el tipo de archivo" + registry.showOptions());
        int choice = Integer.parseInt(fileType);
        FileCreator fileCreator = registry.getCreator(choice);



    }
}
