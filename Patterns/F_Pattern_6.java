/*
    Title: Pattern Basics - 6
    Topic: Patterns [Loops]
    Input: 4
    Output: n=4 i=n j=i
		*
		* *
		* * *
		* * * *
    Author: Vedant Sawant
    Date: 22/12/2023
 */

public class F_Pattern_6
{
	public static void main(String args[])
	{
		int n=4;
		/* USING FOR LOOP */
		System.out.println(" USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	/* USING WHILE LOOP */
	System.out.println(" USING WHILE LOOP ");
	int i=1;
	while(i<=n)
	{
		int j=1;
		while(j<=i)
		{
			System.out.print(" * ");
			j++;
		}
		System.out.println();
		i++;
	}
	}
}


/*  OUTPUT
 

 *
 *  *
 *  *  *
 *  *  *  *


*/