package finalproject;

import java.util.Scanner;
import java.util.ArrayList;

public class RunnerBookManagement {

    private static ArrayList<Book> bookList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            displayMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    // Implement sorting logic here
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    binarySearchForBook();
                    break;
                case 5:
                    linearSearchForBook();
                    break;
                case 6:
                    printBooks();
                    break;
                case 7:
                    checkSize();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n1. Add a new Book");
        System.out.println("2. Sort the Book List");
        System.out.println("3. Delete from the list");
        System.out.println("4. Binary search");
        System.out.println("5. Linear search");
        System.out.println("6. Print list");
        System.out.println("7. Check Size");
        System.out.print("Enter your choice: ");
    }

    private static void addBook() {
        System.out.print("Enter Title of the Book: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        int isbn = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        bookList.add(new Book(title, author, isbn));
        System.out.println("Book added successfully. Total books: " + bookList.size());
    }

    private static void deleteBook() {
        System.out.print("Enter index of book to delete: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void binarySearchForBook() {
        // Implement binary search logic here
    }

    private static void linearSearchForBook() {
        // Implement linear search logic here
    }

    private static void printBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the list.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    private static void checkSize() {
        System.out.println("Total books in the list: " + bookList.size());
    }
}
