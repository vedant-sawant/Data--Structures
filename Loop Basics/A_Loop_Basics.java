/*
    Title: Loops
	Problem: Print Fibonacci Series
    Topic: Loops/ Fibonacci Series
    Input: 24  
	Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, s
    Author: Vedant Sawant
    Date: 15/03/2024
*/


class A_Loop_Basics
{
	public static void fibonacci(int n)
	{
		int first=0,second=1;
		int next=0;
		for(int i=0;i<=n;i++)
		{
			System.out.print(first+", ");
			next=first+second;
			first=second;
			second=next;
		}
	}
	public static void main(String[] args) {
		fibonacci(24);
	}
}

/* OUTPUT 
For n=24
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 
 */