import java.util.*;
public class UI 
{
    Scanner sc = new Scanner(System.in);
    Transaction tr = new Transaction();  
    private final int correctPin = 1234; 
   
    public boolean authenticateUser() {
        int attempts = 0;
        while(attempts < 3) 
        {
            System.out.println("Enter PIN: ");
            int enteredPin = sc.nextInt();
            if(enteredPin == correctPin) 
            {
                System.out.println("PIN Accepted.");
                return true;
            } 
            else 
            {
                attempts++;
                System.out.println("Incorrect PIN. Attempts remaining: " + (3 - attempts));
            }
        }
        return false; 
    }


    public void showMenu()
    {
        System.out.println("\n1.Deposit\n2.Withdrawal\n3.Balance\n4.Exit");
    }

    public int getUserChoice(){
        System.out.println("Enter your choice: ");
        return sc.nextInt();
    }

 
    public void transaction(int choice){
        Integer amount = 0;
        switch(choice){
            case 1: 
                amount = getAmount();
                if(tr.deposit(amount)){
                    System.out.println("Amount Deposited");
                } else {
                    System.out.println("Deposit failed");
                }
                break;

            case 2: 
                amount = getAmount();
                if(tr.withdrawl(amount)){
                    System.out.println("Amount Withdrawn");
                } else {
                    System.out.println("Withdrawal failed");
                }
                break;

            case 3: 
                System.out.println("Balance is: " + tr.getBalance());
                break;

            case 4: 
                sc.close();
                System.exit(0);

            default: 
                System.out.println("Invalid choice");
                break;
        }
    }

 
    public Integer getAmount(){
        System.out.println("Enter Amount: ");
        return sc.nextInt();
    }
}