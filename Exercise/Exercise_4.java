class Library {

    String[] books;

    int no_of_books; // The library constructor is allocating memory for 100 books in a array BOOKS

    Library() { // int no_of_books = space of the book like for eg we are starting from book no.
                // 0 so

        this.books = new String[100]; // int no_of_books = 0 and then it will be ++ later (100 books maximum) memory
                                      // allocated for 100 books here )

        this.no_of_books = 0;

    }

    void addBook(String book) { // As we are going to add books into the library so we will be using addBook
                                // method

        this.books[no_of_books] = book; // this.books[the book number or the space of book where we want to add a new
                                        // book]

        no_of_books++; // after we add a book in space for eg 0th space we will increase no_of_books by
                       // ++

        System.out.println("\"" + book + "\"" + " has been Added!");

    }

    void showAvailableBooks() {

        System.out.println("Available books are: ");

        for (String book : this.books) {

            if (book == null) {

                continue;

            }

            System.out.println("*" + book);

        }

    }

    void issueBook(String book) {

        for (int i = 0; i < this.books.length; i++) {

            if (this.books[i].equals(book)) {

                System.out.println("The book has been issued! ");

                this.books[i] = null;

                return;

            }

        }

        System.out.println("This book does not exist");

    }

    void returnBook(String book) {

        addBook(book);

    }

}

public class Exercise_4 {

    public static void main(String[] args) {

        // You have to implement a library using Java Class "Library"

        // Methods: addBook, issueBook, returnBook, showAvailableBooks

        // Properties: Array to store the available books,

        // Array to store the issued books

        Library centralLibrary = new Library();

        centralLibrary.addBook("Think and Grow Rich");

        centralLibrary.addBook("C++");

        centralLibrary.addBook("My new life!");

        centralLibrary.addBook("Algoriths");

        centralLibrary.addBook("Peter Pan");

        centralLibrary.addBook("ShinChan");

        System.out.println("\n");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");

        System.out.println();

        centralLibrary.showAvailableBooks();

        System.out.println();

        centralLibrary.returnBook("C++");

        System.out.println();

        centralLibrary.showAvailableBooks();

    }

}
