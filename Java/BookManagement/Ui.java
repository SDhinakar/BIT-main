import java.util.Scanner;

public class Ui {
    private Scanner sc = new Scanner(System.in);
    private Transaction transaction = new Transaction();

    public void showMenu() {
        System.out.println("\n1. Add Book \n2. Search Book\n3. Get All Books\n4. Update Status\n5. Delete Book\n6. Exit");
    }
    public int getUserChoice() {
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
    public void processTransaction(int choice) {
        switch (choice) {
            case 1:
                transaction.addBook();
                break;
            case 2:
                transaction.searchBook();
                break;
            case 3:
                transaction.getAllBooks();
                break;
            case 4:
                transaction.updateStatus();
                break;
            case 5:
                transaction.deleteBook();
                break;
            case 6:
                System.out.println("Exiting the program.");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
