/*
    Title: Pattern Basics - 8
    Topic: Patterns [Loops]
    Input: 4
    Output: n=4 i=n j=i
		1
		2 3
		4 5 6
		7 8 9 10
    Author: Vedant Sawant
    Date: 22/12/2023
 */

public class H_Pattern_8
{
	public static void main(String args[])
	{
		int n=4,count=1;

		/* USING FOR LOOP */
		System.out.println(" USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+count+" ");
				count++;
			}
			System.out.println();
		}

		/* USING WHILE LOOP */
		System.out.println(" USING WHILE LOOP ");
		int c=1;
		int i=1;
		while(i<=n)
		{	
			int j=1;
			while(j<=i)
			{
				System.out.print(" "+c+" ");
				c++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

/*   OUTPUT

 USING FOR LOOP
 1
 2  3
 4  5  6
 7  8  9  10
 USING WHILE LOOP
 1
 2  3
 4  5  6
 7  8  9  10

*/