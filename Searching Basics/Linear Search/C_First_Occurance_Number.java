
/*
    Title: Find the First Occurrence of a Target Element and Print its Count
Problem: Given an array of integers nums and a target integer target, return the index of the first occurrence of target with its count in nums, or -1 if target is not found.
Example: nums = [2, 5, 7, 1, 5], target = 5

    Topic: Linear Search
    Input: [2, 5, 7, 1, 5]
    Output: Target Found at Location :1 , Count is 2
    Author: Vedant Sawant
    Date: 23/12/2023
*/

public class C_First_Occurance_Number
{
	public static int occurance(int arr[],int target)
	{
		int count=0;
		int found=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				if(found==0)
				{									System.out.println(target+ " Found at location: "+i);
				found=1;
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
		System.out.println("Count is : "+occurance(arr,target));
	}
}

/*   OUTPUT
5 Found at location: 1
Count of Target is: 2
*/

