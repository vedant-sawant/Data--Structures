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
    private long b;
    private long accnum;
    private String name;
    public BankAccount(long b,long accnum,String name)
    {
        this.b=b;
        this.accnum=accnum;
        this.name=name;
    }

    
}
