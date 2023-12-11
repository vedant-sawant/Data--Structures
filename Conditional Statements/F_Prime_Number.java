/*
    Title: Check Whether a Number is Prime or Not
    Topic: Conditional Statements
    Input: 5
    Output: Prime
    Author: Vedant Sawant
    Date: 11/12/2023
 */
public class F_Prime_Number
{
	public static void main(String args[])
	{
		int p=2;
		for(int i=2;i<=p;i++)
		{
			if(p%i==0)
			{
				System.out.println("NOT PRIME");
			}
			else
			{
				System.out.println("PRIME");
			}
		}
	}

}


/* OUTPUT

PS D:\Codes\Data Structures\Data--Sructures\Conditional Statements> java .\E_Sum_Of_N_Numbers.java
Enter Value of N:
13
Value of N is : 13
Sum of N Even Numbers is: 42

*/