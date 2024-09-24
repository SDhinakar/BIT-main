public class ATM {
    public static void main(String[] args) {
        UI ui = new UI();
        if(ui.authenticateUser()) {
            while(true){
                ui.showMenu();
                int choice = ui.getUserChoice();
                ui.transaction(choice);
            }
        } else {
            System.out.println("Too many incorrect attempts. Exiting the application.");
            System.exit(0);
        }
    }
}