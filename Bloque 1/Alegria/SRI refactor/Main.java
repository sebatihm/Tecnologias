public class Main {
    public static void main(String[] args) {
        Book book = new Book("Alquimista", "Paulo Cohelo", true);
        LibraryMember member = new LibraryMember("Sebastian", "007");
        Library library = new Library(book, member);

        library.showBookStatus();
        library.lendBook();
        library.showBookStatus();
        library.returnBook();
        library.showBookStatus();
    }
}
