/*
 Using the BankAccount class, demonstrate method overriding. Create a derived class 
 called FixedDepositAccount that overrides the withdraw method to ensure that no 
 withdrawals are allowed from a fixed deposit account. Show how method overriding 
 works in the main method.
 */

class BankAccount
{
    private String accountName;
    private long accountNumber;
    protected long balance;
    
        public BankAccount(String accountName,long balance,long accountNumber)
        {
            this.accountName=accountName;
            this.accountNumber=accountNumber;
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
    class FixedDepositAccount extends BankAccount
    {
        private int f;
        public FixedDepositAccount(String accountName,long balance,long accountNumber)
        {
            super(accountName, balance, accountNumber);
        }
        public long deposit(int d)
        {
        
        return f=(int) (getbalance()+d+25);

        }
    }

public class Overriding 
{
    public static void main(String[] args) {
        BankAccount ba=new BankAccount("Vedant",120, 121);
        FixedDepositAccount da=new FixedDepositAccount("Vedant", 200,122);
        
        System.out.println(da.deposit(12));
        System.out.println(ba.deposit(23));
        //da.deposit(0);
    }
}
