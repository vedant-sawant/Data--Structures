/*
    Title: Loops
	Problem: Given a positive integer N, find the last digit of the Nth term from the Fibonacci series.
        
    PL: https://www.geeksforgeeks.org/problems/the-nth-fibonnaci3150/1
    Topic: Loops/ Fibonacci Series
    Input: 14  
    Output: 7 (as 14th Fibonacci number is 377 and last digit is 7)
    Author: Vedant Sawant
    Date: 26/03/2024
*/

class E_Fibo_Last_Digit_GFG
{
	public static int fibo_last_digit(int N)
	{
		int first=1;
		int next=1;
		int sum=2;
		int last=0;
		if(N==1 || N==2)
		{
			return 1;
		}
		else if(N==0)
		{
			return 0;
		}
		else{
			for(int i=3;i<=N;i++)
			{
				sum=first+next;
				first=next;
				next=sum;
			}
			last=Math.abs(next%10); //to avoid negative number and %10 to obtain last digit
			return last;
		}
	}
	public static void main(String[] args) 
	{
		int N=98;
		System.out.println(fibo_last_digit(N));
	}
}

/* OUTPUT 
For N=98
5
 */