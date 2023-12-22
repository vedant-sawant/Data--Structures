/*
    Title: Pattern Basics - 10
    Topic: Patterns [Loops]
    Input: 4
    Output: n=4 i=n j=1
		1
		2 1 
		3 2 1
		4 3 2 1
    Author: Vedant Sawant
    Date: 22/12/2023
 */

public class J_Patterns_10
{
	public static void main(String args[])
	{
		int n=4;

		
		/* USING FOR LOOP */
		System.out.println(" USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)	
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		/* USING WHILE LOOP */
		System.out.println(" USING WHILE LOOP ");
		int i=1;
		while(i<=n)
		{
			int j=i;
			while(j>=1)
			{
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
			i++;
		}
		
	}
}

/*    OUTPUT

 USING FOR LOOP
1
2 1
3 2 1
4 3 2 1
 USING WHILE LOOP
1
2 1
3 2 1
4 3 2 1

*/
