/*
    Title: Print reverse of a number
    Topic: Loops
    Input: 123
    Output: 321
    Author: Vedant Sawant
    Date: 13/12/2023
 */

import java.util.Scanner;

public class H_Reverse_Number {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int lastdigit,reverse=0;
		while(n>0)
		{
			lastdigit=n%10;
			reverse=(reverse*10)+lastdigit;
			n=n/10;
		}
		System.out.println("Reverse of the number is: ");
		System.out.println(reverse);
	}
}






/*    OUTPUT
123
Reverse of the number is:
321 
*/