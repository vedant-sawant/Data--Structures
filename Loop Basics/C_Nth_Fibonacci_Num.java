/*
    Title: Loops
	Problem: Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
    PL: https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156?leftPanelTabValue=PROBLEM
    Topic: Loops/ Fibonacci Series
    Input: 5  
    Output: 5
    Author: Vedant Sawant
    Date: 25/03/2024
*/

class C_Nth_Fibonacci_Num
{
	public static void exact_fibonacci(int n)
	{
		int first=1,next=1;
		int sum=0;
		for(int i=3;i<=n;i++)
		{
			sum=first+next;
			first=next;
			next=sum;
		}
		System.out.println(next);
	}
	public static void main(String[] args) {
		exact_fibonacci(5); //5
	}
}

/* OUTPUT 
For n=5
5
 */