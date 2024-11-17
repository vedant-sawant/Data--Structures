/*
Demonstrate the concept of abstraction using the BankAccount example.
Create an abstract class BankAccount with fields like accountNumber and balance, and abstract methods deposit(int amount) and withdraw(int amount).
Create a concrete subclass SavingsAccount that implements these methods.
In the main method, create an instance of SavingsAccount and perform deposit and withdrawal operations to demonstrate abstraction.
 */
abstract class BankAccount
{
    long accountNumber;
    long balance;
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
}
class SavingsAccount implements BankAccount
{
    

}
public class Abstraction
{
    public static void main(String[] args) 
    {
        
    }
}
