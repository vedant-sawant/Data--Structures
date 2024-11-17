/*
Implement method overloading using the BankAccount example. Create a deposit method 
that accepts either a single integer (amount) or two integers (amount and bonus). 
If the bonus is provided, add it to the deposit amount. Demonstrate method overloading 
in the main method. 
*/

class BankAccount
{
    private long accountNumber;
    private String accountName;
    private long balance;

    public BankAccount(long accountNumber,String accountName,long balance)
    {
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public long getDeposit(int d)
    {
        if(d<0)
        {
            System.out.println("Deposit amount less than 0");
        }  
        else
        {
            balance=balance+d;
        }
        return balance;
    }
    // Overloading means same name difefrent parameters
    public long getDeposit(int d,int bonus)
    {
        return (int) (balance=balance+d+bonus);
    }

    public long withdraw(int w)
    {
        if(w>balance)
        {
            System.out.println("Cannot Deposit more than balance");
        }
        else
        {
            return balance=balance-w;
        }
        return 0;
    }
}
public class Methodoverloading 
{
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(1222, "Vedant", 200);
        System.out.println(ba.getDeposit(12));
        System.out.println(ba.getDeposit(12, 1));
        System.out.println(ba.withdraw(12));
    }    
}
