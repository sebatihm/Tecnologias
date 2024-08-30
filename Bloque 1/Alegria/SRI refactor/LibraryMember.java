public class LibraryMember{
    private String name;
    private String id;
    
    public LibraryMember(String name, String id) {
        this.name = name;
        this.id = id;
    } 
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void borrowBook(Book book){
        if(book.isAvailable()){
            book.setAvailable(false);
            System.out.println("El libro " + book.getTitle() + " ha sido prestado a " + name);
        } else {
            System.out.println("El libro " + book.getTitle() + " no esta disponible");
        }
    }

    public void returnBook(Book book){
        System.out.println("El libro " + book.getTitle() + " ha sido devuelto por " + name);
        book.setAvailable(true);
    }
     


    
}