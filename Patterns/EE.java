/*
    Title: Pattern Basics - 4
    Topic: Patterns [Loops]
    Input: 3
    Output: 
		3 2 1
		3 2 1
		3 2 1
    Author: Vedant Sawant
    Date: 19/12/2023
 */



public class D_Pattern_4
{
	public static void main(String[] args)
	{
		int n=3;
		
		/* USING FOR LOOP */
		System.out.println(" USING FOR LOOP ");
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
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
			int j=n;
			while(j>=1)
			{
				System.out.print(j);
				j--;
			}
			System.out.println();
			i++;
		}
	}

}

/* OUTPUT

 USING FOR LOOP
321
321
321
 USING WHILE LOOP
321
321
321

8/