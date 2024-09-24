public class BookManagement {
    public static void main(String[] args) 
    {
        Ui ui = new Ui();
        while (true) {
            ui.showMenu();
            int choice = ui.getUserChoice();
            ui.processTransaction(choice);
        }
    }
}