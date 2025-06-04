package oops_part1.Library;

import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Library library = new Library();

        // Sample books
        library.addBook(new Book(1, "Atomic Habits", "James Clear"));
        library.addBook(new Book(2, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(3, "Clean Code", "Robert Martin"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Show Books");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Boo2k");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    Book found = library.searchBook(searchTitle);
                    System.out.println(found != null ? found : "Book not found.");
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);

        sc.close();
    }
}

