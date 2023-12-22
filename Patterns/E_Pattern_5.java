/*
    Title: Pattern Basics - 5
    Topic: Patterns [Loops]
    Input: 3
    Output: 
		1 2 3
		4 5 6	
		7 8 9
    Author: Vedant Sawant
    Date: 22/12/2023
 */

public class E_Pattern_5 {
public static void main(String args[])
{
	int n=3,count=1;

	/* USING FOR LOOP */
	System.out.println(" USING FOR LOOP ");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			
			System.out.print(count);
			count++;
		}
		System.out.println();
	}

	
	/* USING WHILE LOOP */
	System.out.println(" USING WHILE LOOP ");
	int i=1,c=1;
	while(i<=n)
	{
		int j=1;
		while(j<=n)
		{
			System.out.print(c);
			c++;
			j++;
		}
		System.out.println();
		i++;
	}




}
}

/*   OUTPUT

123
456
789

*/