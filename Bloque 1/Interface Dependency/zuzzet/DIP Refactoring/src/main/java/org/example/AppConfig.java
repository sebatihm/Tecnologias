package org.example;

public class AppConfig {
    public static DocumentCreator generateDocumentGenerator() {
        FileCreatorRegistry registry = new FileCreatorRegistry();
        registry.registerCreators(1, new TxtFileCreator(), TxtFileCreator.getType());
        registry.registerCreators(2, new DocxFileCreator(), DocxFileCreator.getType());
        

        InputReader inputReader = new ConsoleReader();
        return new DocumentCreator(inputReader, registry);
    }
}
