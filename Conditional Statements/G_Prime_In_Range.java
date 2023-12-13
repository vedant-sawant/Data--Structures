/*
    Title: Check all primes in range
    Topic: Conditional Statements
    Input: 5
    Output: Prime
    Author: Vedant Sawant
    Date: 11/12/2023
 */
import java.lang.*;
public class G_Prime_In_Range
{
	public static void main(String args[])
	{
		for(int j=2;j<=5;j++)
		{
			for(int i=2;i<=j;i++)  //here we cant write math.sqrt(j) because it will not satisfy conditions of 2 & 3
			{
				if(j%i==0)		
				{
					System.out.println("NOT PRIME"+j);
				}
				else
				{
					System.out.println("PRIME"+j);
				}
			}
		}

		
	}
}