/*
    Title: Check Whether a Number is Prime or Not
    Topic: Conditional Statements
    Input: 5
    Output: Prime
    Author: Vedant Sawant
    Date: 11/12/2023
 */
import java.lang.*;
public class F_Prime_Number
{
	public static void main(String args[])
	{
		int p=5;


/*    ------ BRUTE FORCE ----------------
		for(int i=2;i<=p-1;i++)
		{
			if(p%i==0)
			{
				System.out.println("NOT PRIME");
				break;
			}
			else
			{
				System.out.println("PRIME");
				break;
			}
		}
	}
*/


/* ------------- OPTIMIZED SOLUTION ------- */
		for(int i=2;i<=Math.sqrt(p);i++)
		{
			if(p%i==0)
			{
				System.out.println("NOT PRIME");
				break;
			}
			else{
				System.out.println("PRIME");
				break;
			}

		}


}

}
/* OUTPUT

PRIME

*/