/*
    Title: Loops
	Problem: Given a number positive number N, find value of f0 + f1 + f2 + . + fN where fi indicates ith Fibonacci number.
    Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
    Since the answer can be very large, answer modulo 1000000007 should be returned.
    PL: https://www.geeksforgeeks.org/problems/fibonacci-sum1423/1
    Topic: Loops/ Fibonacci Series
    Input: 3  
    Output: 4 (as 1+1+2=4)
    Author: Vedant Sawant
    Date: 25/03/2024
*/

class D_Fibonacci_Sum_GFG
{
	public static int fibonacci_sum(int n)
	{
		int first=1;
		int next=1;
		int sum=0;
		int add=2;
		for(int i=3;i<=n;i++)
		{
			sum=first+next; ///2
			first=next;  //f=
			next=sum;
			System.out.println(sum);
			add=sum+add;
		}
		return add;
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(fibonacci_sum(n));
	}
}

/* OUTPUT 
For n=5
5
 */