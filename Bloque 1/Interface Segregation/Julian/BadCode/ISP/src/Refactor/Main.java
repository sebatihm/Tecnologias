package Refactor;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        LocalFile localFile = new LocalFile("Localito", "Yopo", "Luisitos");
        DropboxFile dropboxFile = new DropboxFile("drop", "box", "dropbox");

        FileImporter fileImporter = new FileImporter();
        FilePermissionManager filePermissionManager = new FilePermissionManager();

        System.out.println(localFile.getName());
        fileImporter.importFile(localFile, "localitoImportado");
        System.out.println(localFile.getName());

        System.out.println(dropboxFile.getName());
        fileImporter.importFile(dropboxFile, "dropo");
        System.out.println(dropboxFile.getName());

        System.out.println("Propietario: " + localFile.getOwnerUsername() + "\nGrupo: " + localFile.getOwnerGroupName());
        filePermissionManager.transferOwnership(localFile, "HenryGay", "Anfequito");
        System.out.println("Propietario: " + localFile.getOwnerUsername() + "\nGrupo: " + localFile.getOwnerGroupName());
    }
}