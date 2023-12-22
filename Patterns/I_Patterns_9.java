/*
    Title: Pattern Basics - 9
    Topic: Patterns [Loops]
    Input: 4
    Output: n=4 i=n j=i
		1
		2 3
		3 4 5
		4 5 6 7
    Author: Vedant Sawant
    Date: 22/12/2023
 */

public class I_Patterns_9
{
	public static void main(String args[])
	{
		int n=4;

		
		/* WAY 1 - USING FOR LOOP */
		System.out.println(" WAY 1 - USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			int value=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+value+" ");
				value++;
			}
			System.out.println();
		}

		
		/* WAY 2 - USING FOR LOOP */
		System.out.println(" WAY 2 - USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+((i+j)-1)+" ");
			}
			System.out.println();
	
		}

		/* WAY 1 - USING WHILE LOOP */
		System.out.println(" WAY 1 - USING WHILE LOOP ");
		int i=1;
		while(i<=n)
		{
			int value=i,j=1;
			while(j<=i)
			{
				System.out.print(" "+value+" ");
				value++;
				j++;
			}
			System.out.println();
			i++;
		}

		/* WAY 2 - USING WHILE LOOP */
		System.out.println(" WAY 2 - USING WHILE LOOP ");
		int a=1;
		while(a<=n)
		{
			int j=1;
			while(j<=a)
			{
				System.out.print((a+j-1)+" ");
				j++;
			}
			System.out.println();
			a++;

		}
	}
}
/*   OUTPUT

WAY 1 - USING FOR LOOP
 1
 2  3
 3  4  5
 4  5  6  7
 WAY 2 - USING FOR LOOP
 1
 2  3
 3  4  5
 4  5  6  7
 WAY 1 - USING WHILE LOOP
 1
 2  3
 3  4  5
 4  5  6  7
 WAY 2 - USING WHILE LOOP
1
2 3
3 4 5
4 5 6 7

*/