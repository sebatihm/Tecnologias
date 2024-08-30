public class Main{
    public static void main(String[] args) {
        Library usbi = new Library("Fundamentos de Sistema Operativos", "JVergara", true, "fulano", "I23");
        usbi.isAvailable();
        usbi.lendBook();
        usbi.isAvailable();
    }
}