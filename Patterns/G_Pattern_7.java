/*
    Title: Pattern Basics - 7
    Topic: Patterns [Loops]
    Input: 4
    Output: n=4 i=n j=i
		1
		2 2
		3 3 3
		4 4 4 4
    Author: Vedant Sawant
    Date: 22/12/2023
 */

public class G_Pattern_7
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
			while(j<=i)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
			
		}
	}
}

/* OUTPUT
 USING FOR LOOP
1
22
333
4444
 USING WHILE LOOP
1
22
333
4444




*/