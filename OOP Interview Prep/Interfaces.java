/*
 Demonstrate the concept of interfaces using a BankAccount example.
Create an interface BankOperations with methods deposit, withdraw, and getBalance.
Implement this interface in a class SavingsAccount and provide the functionality for each method.
In the main method, create an instance of SavingsAccount and perform deposit, withdraw, and balance check operations.
 */
interface BankAccount
{
    
    long deposit(int d);
    long withdraw(int w);
}
class Bank implements BankAccount
{
    private int balance;
    public Bank(int balance)
    {
        this.balance=balance;
    }
    public long deposit(int d)
    {
        return balance=balance+d;
    }
    public long withdraw(int w)
    {
        return balance=balance-w;
    }
    public long getbalance()
    {
        return balance;
    }
}
public class Interfaces 
{
    public static void main(String[] args) {
        Bank b=new Bank(120);
        System.out.println(b.deposit(12));
        System.out.println(b.withdraw(12));
        System.out.println(b.getbalance());
    }    
}
