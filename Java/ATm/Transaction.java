public class Transaction 
{
    private Integer balance = 1000;

    public Boolean deposit(Integer amount){
        if(amount > 0){
            balance += amount;
            return true;
        }
        return false;
    }

    public Boolean withdrawl(Integer amount){
        if(amount > 0 && getBalance() >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    public Integer getBalance(){
        return balance;
    }
}