/*
    Title: GeeksForGeeks Find position of an element in a sorted array of infinite numbers
     PL: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    Topic: Binary Search
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: 3     (without using arr.length function)
    Author: Vedant Sawant
    Date: 02/01/2024
*/

public class H_Infine_Array_GFG
{
	public static int binary_search(int arr[],int target,int low,int high)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			else if(target>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
		int target=10;
		int low=0;
		int high=1;
		while(target>arr[high])
		{
			int newlow=high+1;
			high=high+(high-low+1)*2;
			low=newlow;	
		}
		System.out.println(binary_search(arr,target,low,high));
	}
}

/* OUTPUT
4
*/