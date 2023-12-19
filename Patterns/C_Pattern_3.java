/*
    Title: Pattern Basics - 3
    Topic: Patterns [Loops]
    Input: 4
    Output: 
		1 2 3 4
		1 2 3 4
		1 2 3 4
		1 2 3 4
    Author: Vedant Sawant
    Date: 19/12/2023
 */


public class C_Pattern_3
{

	public static void main(String args[])
	{
		int n=4;

		/* USING FOR LOOP */
		System.out.println(" USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
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
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}	
}

/* OUTPUT

 USING FOR LOOP
1234
1234
1234
1234
 USING WHILE LOOP
1234
1234
1234
1234
*/