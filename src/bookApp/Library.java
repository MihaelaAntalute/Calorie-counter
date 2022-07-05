package bookApp;

public class Library {
    Book[] bookList = new Book[100];
    int numberOfBooksAdded;

    public void printBooks() {
        for (int i = 0; i < numberOfBooksAdded; i++) {
            System.out.println(bookList[i]);
        }
    }

    public boolean addBook(Book book) {
        bookList[numberOfBooksAdded] = book;
        numberOfBooksAdded++;
        return true;
    }

    public String[] findBooksByAuthor(String author) {
        String[] foundBooks = new String[numberOfBooksAdded];
        int numberOfFoundBooksAdded = 0;
        for (int i = 0; i < numberOfBooksAdded; i++) {
            if (bookList[i].author.contains(author)) {
                foundBooks[numberOfFoundBooksAdded] = bookList[i].title;
                numberOfFoundBooksAdded++;
            }
        }
        return foundBooks;
    }

    //   public String[] findAllPalindromBooks() {
    // }
    public boolean searchPalindrom(String word) {
        boolean isPalindrom = false;
        String reversString = "";
        for (int i = word.length(); i > 0; i--) {
            reversString = reversString + word.charAt(i);
        }
        System.out.println(reversString);//verificare dak e ok cuvantul
        if (word.equals(reversString)) {
            isPalindrom = true;
        }
        return isPalindrom;
    }

}
