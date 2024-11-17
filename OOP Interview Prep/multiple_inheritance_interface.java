/*
Question:
Explain multiple inheritance using interfaces with an example.
Create two interfaces, BankOperations (with methods deposit and withdraw) and LoanOperations (with methods applyForLoan and getLoanBalance).
Implement both interfaces in a class CustomerAccount that provides functionality for all methods.
Demonstrate how multiple inheritance works in Java by creating an instance of CustomerAccount in the main method and calling methods from both interfaces.
*/
/*
 Multiple inheritance means
 class A
 {
    void get()
    {
    }
 }
 class B
 {
    void get()
    {
    }
 }
 class C extends class A,B //this is not possible
 {
    cc.get(); //as it doesnt know which get method to call
 }
 */

interface BankOperations
{
    String branch="SBI GHOTI";
    void getname();

}
interface BankCustomer
{
    void getname();
} 
class Run implements BankOperations,BankCustomer
{
    public void getname()
    {
        System.out.println("Returning Name");
    }
}
public class multiple_inheritance_interface 
{
    public static void main(String[] args) 
    {
        Run r=new Run();
        r.getname();
    }
}
