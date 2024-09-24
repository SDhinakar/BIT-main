  import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transaction {
    private List<Book> bookList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.println("Enter the number of books to add (max 10): ");
        int count = sc.nextInt();
        sc.nextLine(); // Consume the newline

        if (count > 10) {
            System.out.println("You can add a maximum of 10 books at a time.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine(); // Consume the newline

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Publisher: ");
            String publisher = sc.nextLine();

            System.out.print("Price: ");
            Float price = sc.nextFloat();
            sc.nextLine(); // Consume the newline

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Status (true for available, false for not available): ");
            Boolean status = sc.nextBoolean();
            sc.nextLine(); // Consume the newline

            Book book = new Book(id, title, author, publisher, price, department, status);
            bookList.add(book);
            System.out.println("Book added successfully.");
        }
    }

    public void searchBook() {
        System.out.print("Enter book ID to search: ");
        Integer id = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void getAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the system.");
            return;
        }

        System.out.println("List of all books:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public void updateStatus() {
        System.out.print("Enter book ID to update status: ");
        Integer id = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                System.out.print("Enter new status (true for available, false for not available): ");
                Boolean status = sc.nextBoolean();
                sc.nextLine(); // Consume the newline
                book.setStatus(status);
                System.out.println("Book status updated.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteBook() {
        System.out.print("Enter book ID to delete: ");
        Integer id = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                book.setStatus(false);
                System.out.println("Book status set to 'Not Available'.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
