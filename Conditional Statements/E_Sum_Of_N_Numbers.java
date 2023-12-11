/*
    Title: Sum of N Even numbers
    Topic: Conditional Statements
    Input: N
    Output: Sum of Even numbers upto N
    Author: Vedant Sawant
    Date: 11/12/2023
 */
import java.util.Scanner;

public class E_Sum_Of_N_Numbers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//read value N
		System.out.println("Enter Value of N: ");
		int n=sc.nextInt();
		System.out.println("Value of N is : "+n);
		int sum=0;
		//Show user numbers uptill n
		for(int i=1;i<=n;i++)
		{
								
			if(i%2==0)
			{
				sum=i+sum;
			}
		}
		System.out.println("Sum of N Even Numbers is: "+sum);
		
	}
}





/* OUTPUT

PS D:\Codes\Data Structures\Data--Sructures\Conditional Statements> java .\E_Sum_Of_N_Numbers.java
Enter Value of N:
13
Value of N is : 13
Sum of N Even Numbers is: 42

*/