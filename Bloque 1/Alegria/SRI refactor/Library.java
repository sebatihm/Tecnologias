public class Library{
    private Book book;
    private LibraryMember member;

    public Library(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
    }
    
    
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public LibraryMember getMember() {
        return member;
    }
    public void setMember(LibraryMember member) {
        this.member = member;
    }

    public void showBookStatus(){
        System.out.println("El estado del libro "+ book.getTitle() + (book.isAvailable()?" esta disponible":" no esta disponible") );
    }
    
    public void lendBook(){
        member.borrowBook(book);
    }

    public void returnBook(){
        member.returnBook(book);
    }


}