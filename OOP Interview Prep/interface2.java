/* 
 Create an interface Account with methods openAccount() and closeAccount().
Create another interface SavingsAccount that extends Account and adds methods deposit() and withdraw().
Create a class Customer that implements SavingsAccount and provides functionality for all methods.
Demonstrate hierarchical inheritance by invoking methods from both the Account and SavingsAccount interfaces in the main method.
*/

interface Account
{
    int v=12;
    void openAccount();
    void closeAccount();
}
interface SavingsAccount extends Account
{
    void deposit();
    void withdraw();
}
class bank implements SavingsAccount
{
    public void deposit()
    {
        System.out.println("This is deposit method");
    }
    public void withdraw()
    {
        System.out.println("This is WIthdraw method");
    }
    public void closeAccount()
    {
        System.out.println("This is close Account method");
    }
    public void openAccount()
    {
        System.out.println("This is open account method "+v);
    }
}
class interface2
{
    public static void main(String[] args) {
        bank b=new bank();
        b.deposit();
        b.withdraw();
        b.openAccount();
        b.closeAccount();
    }
}