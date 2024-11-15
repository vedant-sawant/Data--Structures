/*
 Explain encapsulation and demonstrate it with a Java program. 
 Create a class called BankAccount with private fields for accountNumber, 
 accountHolderName, and balance. Provide public getter and setter methods for each 
 field to allow controlled access to these private fields. Additionally, add a 
 deposit method to increase the balance and a withdraw method to reduce the balance, 
 making sure that the withdrawal amount doesn’t exceed the current balance.
 */
// Encapsulation means hiding of data and only showing what is required.


class BankAccount 
{
    private long accountNumber;
    private String accountHolderName;
    private long balance;

    public BankAccount(long accountNumber,String accountHolderName,long balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void deposit(int depo)
    {
        if(balance<0)
        {
            System.out.println("Pre cehcks failed");
        }
        else
        {
            balance=balance+depo;
        }
    }
    public void withdraw(int takeout)
    {
        if(takeout>balance)
        {
            System.out.println("Pre checks failed - takeout>balance");
        }
        else
        {
            balance=balance-takeout;
        }
    }
    public void printbalance()
    {
        System.out.println("Balance: "+balance);
    }

}
public class Bank 
{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(1111, "Vedant", 100);
        b1.withdraw(50);
        b1.printbalance();  
        b1.deposit(900);
        b1.printbalance();  
    }
    
}
