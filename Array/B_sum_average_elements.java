/*
    Title: Java Program to Take array as input from user ,make sum of all elements and average and print.
    Topic: Array
    Input: 1 2 3 4 
    Output: Sum=10 Average=5
    Author: Vedant Sawant
    Date: 17/09/2023
 */

import java.util.*;

class B_sum_average_elements
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		//Take how many elements you want in array
		System.out.print("How many Elements in array: ");
		int num=sc.nextInt();
		
		//initialize the array
		int arr[]=new int[num];

		//take input of array elements
		System.out.print("Enter array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
			
		}
		
		int sum=0;
		//Display the elements
		System.out.print("Array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			//calculate sum of elements
			sum=arr[i]+sum;
		}
		//calculate average of elements
		int average=sum/arr.length;
		
		//Print Calculated SUm and Average 
		System.out.println("Sum of array is "+sum+" & Average of array is: "+average);
		
		
			
		   
	}
}


/* OUTPUT

How many Elements in array: 3
Enter array Elements: 1 2 3
Array Elements: 1
2
3
Sum of array is 6 & Average of array is: 2

*/