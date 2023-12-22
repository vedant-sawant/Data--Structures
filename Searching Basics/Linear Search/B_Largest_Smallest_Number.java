/*
    Title: Searching
    Topic: Linear Search
    Input: Array
    Output: Largest and Smallest Number from the Array
    Author: Vedant Sawant
    Date: 22/12/2023
*/
import java.util.Scanner;
public class B_Largest_Smallest_Number
{
	public static void find(int arr[])
	{
		//int small=INTEGER.MAX_VALUE,large=INTEGER.MIN_VALUE;
		int small=arr[0],large=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println("Smallest: "+small);
		System.out.println("Largest: "+large);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		//take length of array from user
		System.out.println("How many Elements You want?: ");		
		int n=sc.nextInt();

		//declare array of n size
		int arr[]=new int[n];
		
		//take input array elements
		System.out.println("Enter "+n+" array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		//call the function
		find(arr);
	}
}

/* OUTPUT
How many Elements You want?:
4
Enter 4 array Elements:
1 2 3 4
Smallest: 1
Largest: 4
*/

