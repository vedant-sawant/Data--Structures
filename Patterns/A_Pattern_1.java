/*
    Title: Pattern Basics - 1
    Topic: Patterns [Loops]
    Input: 3
    Output: 
		***
		***
		***
    Author: Vedant Sawant
    Date: 18/12/2023
 */

public class A_Pattern_1
{
	public static void main(String args[])
	{
		int n=3;
		/* USING FOR LOOP */
		System.out.println(" USING FOR LOOP ");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println(" USING WHILE LOOP ");
		int i=1;
		while(i<=n)
		{	
			int j=1;
			while(j<=n)
			{
				System.out.print(" * ");
				j++;
			}
			System.out.println();
			i++;
			
		}

	}
}

/*    OUTPUT
123
Reverse of the number is:
321 
*/