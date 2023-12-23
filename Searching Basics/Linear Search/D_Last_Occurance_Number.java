/*
    Title: Find the Last Occurrence of a Target Element and Print its Count
Problem: Given an array of integers nums and a target integer target, return the index of the Last occurrence of target with its count in nums, or -1 if target is not found.
Example: nums = [2, 5, 7, 1, 5], target = 5

    Topic: Linear Search
    Input: [2, 5, 7, 1, 5]
    Output: Target Found at Location :4 , Count is 2
    Author: Vedant Sawant
    Date: 23/12/2023
*/

public class D_Last_Occurance_Number
{
	public static int last(int arr[],int target)
	{
		int flag=0;
		int count=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==target)
			{
				if(flag==0)
				{									System.out.println(target+ " Found at location: "+i);
			flag=1;
				}
				count++;	
			}
		}
		return count;
	}

	public static void main(String args[])
	{
		int[] arr={2,5,7,1,5};
		int target=5;
		System.out.println(" Count: "+last(arr,target));
	}
}

/* OUTPUT
5 Found at location: 4
 Count: 2
*/