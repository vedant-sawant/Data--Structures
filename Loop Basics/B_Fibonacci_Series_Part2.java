/*
    Title: Loops
	Problem: Print Fibonacci Series Upto N
    Topic: Loops/ Fibonacci Series
    Input: 6   
    Output: 1,1,2,3,5,6
    Author: Vedant Sawant
    Date: 15/03/2024
*/

class B_Fibonacci_Series_Part2
{
	public static void exact_fibonacci(int n)
	{
		int first=1,next=1;
		int sum=0;
		
		System.out.println(first);
		System.out.println(next);
		for(int i=3;i<=n;i++)
		{
			
			sum=first+next;
			first=next;
			next=sum;
			System.out.println(sum);

		}
	}
	public static void main(String[] args) {
		exact_fibonacci(5); //5
	}
}

/* OUTPUT 
For n=5
1 1 2 3 5
 */