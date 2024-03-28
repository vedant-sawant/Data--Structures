/*
    Title: Loops
	Problem: Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
    PL: CN https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156?leftPanelTabValue=PROBLEM
    PL: LeetCode 509. https://leetcode.com/problems/fibonacci-number/
	PL: GFG. https://www.geeksforgeeks.org/problems/the-nth-fibonnaci3150/1
    Topic: Loops/ Fibonacci Series
    Input: 5  
    Output: 5
    Author: Vedant Sawant
    Date: 25/03/2024
*/

class C_Nth_Fibonacci_Num_509L
{
	public static void exact_fibonacci(int n)
	{
		int first=1,next=1;
		int sum=2;
		for(int i=3;i<=n;i++)
		{
			sum=first+next;
			first=next;
			next=sum;
		}
		next=next%10;
		System.out.println(next);
	}
	public static void main(String[] args) {
		exact_fibonacci(51); //5
	}
}

/* OUTPUT 
For n=5
5
 */