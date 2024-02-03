import java.util.Arrays;
 class LibrarySystem {
    private  int maxBooks = 100;
    private String[] availableBooks;
    private String[] issuedBooks;
    private int numAvailableBooks;
    private int numIssuedBooks;

    public LibrarySystem() {
        availableBooks = new String[maxBooks];
        issuedBooks = new String[maxBooks];
        numAvailableBooks = 0;
        numIssuedBooks = 0;
    }

  
    public void addBook(String bookTitle) {
        if (numAvailableBooks < maxBooks) {
            availableBooks[numAvailableBooks] = bookTitle;
            numAvailableBooks++;
            System.out.println("Book added: " + bookTitle);
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void issueBook(String bookTitle) {
        boolean found = false;
        for (int i = 0; i < numAvailableBooks; i++) {
            if (availableBooks[i].equals(bookTitle)) {
                issuedBooks[numIssuedBooks] = availableBooks[i];
                numIssuedBooks++;
                for (int j = i; j < numAvailableBooks - 1; j++) {
                    availableBooks[j] = availableBooks[j + 1];
                }
                availableBooks[numAvailableBooks - 1] = null;
                numAvailableBooks--;
                found = true;
                System.out.println("Book issued: " + bookTitle);
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found or already issued: " + bookTitle);
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < numAvailableBooks; i++) {
            System.out.println(availableBooks[i]);
        }
    }

    public void displayIssuedBooks() {
        System.out.println("Issued Books:");
        for (int i = 0; i < numIssuedBooks; i++) {
            System.out.println(issuedBooks[i]);
        }
    }
 }
public class Task1{
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

      library.addBook("Alice in wonderland");
      library.addBook("Black Beauty");
      library.addBook("Autobiograpy of a Yogi");
      library.addBook("Wings of Fire");
      library.addBook("Death- By Sathguru");
      library.addBook("Karma _By Sathguru");
      library.addBook("Book 7");
      library.addBook("Book 8");
        library.displayAvailableBooks();
        library.issueBook("Black Beauty");

        library.displayAvailableBooks();
        library.displayIssuedBooks();
    }
}

