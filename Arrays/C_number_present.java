/*
    Title: Java Program to Check if Number is present in array or not.
    Topic: Array
    Input: 1 2 3 4 , number=4 
    Output: present
    Author: Vedant Sawant
    Date: 18/09/2023
 */

import java.util.*;
public class C_number_present 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//take number of elements in array
		System.out.print("How many numbers you want in array? ");
		int number=sc.nextInt();
		
		//initialize array named arr
		int arr[]=new int[number];
		
		//take input of array elements
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		// initialize target to be searched
		int target;
		
		//take input from user target to be searched for
		System.out.print("Enter target to be searched for: ");
		target=sc.nextInt();

		//Check for number through for loop iteration
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				System.out.print(target+" is present at location "+i);
			}
		}
	}

}

/*
OUTPUT
How many numbers you want in array? 3
Enter Array Elements: 1 2 3
Enter target to be searched for: 2
2 is present at location 1


*/
