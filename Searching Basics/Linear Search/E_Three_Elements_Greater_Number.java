/*
    Title: Find the First Three Elements Greater Than a Given Value
Problem: Given an array of integers nums and an integer value, return the index of the first elements in nums that is greater than value, or -1 if no such element exists.
Example: nums = [1, 4, 2, 3, 6], value = 3

    Topic: Linear Search
    Input: [2, 5, 7, 1, 5] & value=3
    Output: 
		4 Found at Location : 1
		6 Found at Location : 4
		7 Found at Location : 5
    Author: Vedant Sawant
    Date: 23/12/2023
*/

public class E_Three_Elements_Greater_Number
{
	public static void threegreater(int arr[],int value)
	{
		int count=0;
		for(int i=0;i<arr.length && count<3;i++)
		{
			if(arr[i]>value)
			{
				System.out.println(arr[i]+" Found at Location : "+i);
				count++;
			}
		}
		
	}
	public static void main(String args[])
	{
		int arr[]={1,4,2,3,6,7};
		int value=3;
		threegreater(arr,value);
	}
}

/*   OUTPUT

4 Found at Location : 1
6 Found at Location : 4
7 Found at Location : 5

*/
