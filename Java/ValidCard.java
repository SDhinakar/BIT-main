import java.util.Scanner;
public class ValidCard 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            System.out.print("Enter the card number: ");
            String cardNumber = scan.nextLine();
            if(isValidLength(cardNumber) && startingDigit(cardNumber) && isLuhmNumber(cardNumber))
                System.out.println("Valid Card");
            else    
                System.out.println("Invalid Card");
        }
    }

    public static boolean isValidLength(String cardNumber)
    {
        int length=cardNumber.length();
        return length>=13 && length<=16;
    }

    public static boolean startingDigit(String cardNumber)
    {
        return cardNumber.startsWith("37")||cardNumber.startsWith("4")||cardNumber.startsWith("5")||cardNumber.startsWith("6");
    }

    public static boolean isLuhmNumber(String cardNumber)
    {
        Integer sum=0;
        Boolean isSecond=false;
        for(Integer i=cardNumber.length()-1;i>=0;i--)
        {
            Integer digit = cardNumber.charAt(i)-'0';
            if(isSecond==true)
                digit*=2;
            sum+=digit/10;
            sum+=digit%10; 
            isSecond=!isSecond;
        }
        return sum%10==0;
    } 
}