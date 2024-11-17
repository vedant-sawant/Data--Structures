/*
 Let's build on the BankAccount example using inheritance. Create a base class called 
 BankAccount with fields for accountNumber, accountHolderName, and balance. 
 Then, create a derived class SavingsAccount that inherits from BankAccount and 
 adds a unique feature: an interestRate field and a calculateInterest() method that 
 calculates interest based on the balance.
 In your main method, create an instance of SavingsAccount, deposit some money, 
 calculate interest, and print the updated balance to demonstrate inheritance.
 */

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

    public long withdraw(int w)
    {
        if(w>balance)
        {
            System.out.println("Invalid ! .....");   
        }    
        return balance=balance-w;
    }


    public long deposit(int d)
    {
        return balance=balance+d;
    }

    public long getbalance()
    {
        return balance;
    }


}
class Intrest extends BankAccount
{
    private long interstss;

    public Intrest(long accountNumber,String accountHolderName,long balance,long interstss)
    {
        super(accountNumber, accountHolderName, balance);
        this.interstss=interstss;
    }

    public int getintrest()
    {
        return (int) (getbalance()*interstss/100);
    }
}
class Inheritance
{
    public static void main(String[] args) {
        Intrest in=new Intrest(111,"Vedant",100,12);
        System.out.println(in.getbalance());
        System.out.println(in.getintrest());
    }
}