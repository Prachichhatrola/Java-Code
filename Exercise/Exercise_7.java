package com.company;

import java.util.*;

import java.time.*;

import java.time.format.DateTimeFormatter;

class Book {

    ArrayList<Book> books = new ArrayList<Book>();

    String bookName;

    String authorName;

    String issuedTo = "None";

    String issuedOn = "None";

}

class BookMethods extends Book {

    public int startP() {

        System.out.print("\n1.Add Book\n2.Show Books\n3.Issue Book\n4.Return Book\n5.Exit\n\nYour Choice: ");

        Scanner sc = new Scanner(System.in);

        int selection = sc.nextInt();

        return selection;

    }

    public void addBook() {

        boolean boo = true;

        while (boo) {

            Book b = new Book();

            LocalDateTime dateTime = LocalDateTime.now();

            DateTimeFormatter dateTimeF = DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm a");

            String formattedDateTime = dateTime.format(dateTimeF);

            System.out.print("\nThe book you want to add: ");

            Scanner sc1 = new Scanner(System.in);

            String bName = sc1.nextLine();

            b.bookName = bName;

            System.out.print("Author name: ");

            Scanner sc2 = new Scanner(System.in);

            String aName = sc2.nextLine();

            b.authorName = aName;

            books.add(b);

            System.out.println("\n---You added " + bName + " by " + aName + " on " + formattedDateTime + "---");

            System.out.print("\nDo you want to add more book?\n1.Yes\n2.No\nYour choice: ");

            Scanner sc3 = new Scanner(System.in);

            int choice = sc3.nextInt();

            if (choice == 1) {

                boo = true;

            }

            else {

                boo = false;

            }

        }

    }

    public void showBook() {

        for (int i = 0; i < books.size(); i++) {

            System.out.println((i + 1) + "." + books.get(i).bookName + " issued to " + books.get(i).issuedTo);

        }

    }

    public void issueBook() {

        showBook();

        LocalDateTime dateTime2 = LocalDateTime.now();

        DateTimeFormatter dateTimeF2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm a");

        String formattedDateTime2 = dateTime2.format(dateTimeF2);

        System.out.print("\nWhich book do you want to issue?\n- ");

        Scanner sc4 = new Scanner(System.in);

        int bookChoice = sc4.nextInt() - 1;

        System.out.print("Your name: ");

        Scanner sc5 = new Scanner(System.in);

        String issuerName = sc5.nextLine();

        books.get(bookChoice).issuedTo = issuerName;

        System.out.print("\n---" + books.get(bookChoice).bookName + " by " + books.get(bookChoice).authorName
                + " issued to " + books.get(bookChoice).issuedTo + " on " + formattedDateTime2 + "---\n");

    }

    // use equals() to compare string

    public void returnBook() {

        System.out.print("\nEnter the book name: ");

        Scanner sc6 = new Scanner(System.in);

        String check = sc6.nextLine();

        String n = "None";

        int k = 0;

        for (int i = 0; i < books.size(); i++) {

            String compare = books.get(i).bookName;

            if (check.equals(compare)) {

                books.get(k).issuedTo = n;

                showBook();

            }

            else {

                k++;

                continue;

            }

        }

    }

}

public class Exercise_7 {

    public static void main(String[] args) {

        System.out.println("Welcome to our Library!");

        BookMethods b1 = new BookMethods();

        boolean boo3 = true;

        while (boo3) {

            int selectionFinally = b1.startP();

            switch (selectionFinally) {

                case 1:

                    b1.addBook();

                    break;

                case 2:

                    b1.showBook();

                    break;

                case 3:

                    b1.issueBook();

                    break;

                case 4:

                    b1.returnBook();

                    break;

                case 5:

                    boo3 = false;

                    break;

            }

        }

    }

}
