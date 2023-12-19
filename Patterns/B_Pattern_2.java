/*
    Title: Pattern Basics - 1
    Topic: Patterns [Loops]
    Input: 3
    Output: 
		1 1 1
		2 2 2
		3 3 3
    Author: Vedant Sawant
    Date: 19/12/2023
 */

public class B_Pattern_2{
	public static void main(String args[])	
	{
		int n=3;

		/* USING FOR LOOP */
		System.out.println(" USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		

		/* USING WHILE LOOP */
		System.out.println(" USING WHILE LOOP ");
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
			
		}
	}
}