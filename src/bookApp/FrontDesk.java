package bookApp;

public class FrontDesk {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Book1", "John Autor1", 30);
        Book book1 = new Book("Book2", "Autor1", 22);
        Book book2 = new Book("Book3", "John Autor2", 24);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.printBooks();
        String[] foundBooks = library.findBooksByAuthor("John");
        for(int i = 0; i < foundBooks.length; i++){
            System.out.println(foundBooks[i]);
        }
        boolean isPalindrom = library.searchPalindrom("ana");
        System.out.println(isPalindrom);
    }
}
