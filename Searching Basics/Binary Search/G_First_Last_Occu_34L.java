/*
    Title: LeetCode 34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.
    Topic: Binary Search
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Author: Vedant Sawant
    Date: 01/01/2024
*/
public class G_First_Last_Occu_34L
{
	public static int search(int nums[],int target,boolean firstoccu)
	{
		int low=0;
		int high=nums.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(target==nums[mid])
			{
				ans=mid;
				if(firstoccu==true)
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			else if(target>nums[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return ans;
	}
	public static void main(String args[])
	{
		int nums[]={5,7,7,7,7,8,8};
		int target=7;
		boolean firstoccu=true;
		int a[]={-1,-1};
		a[0]=search(nums,target,firstoccu=true);
		a[1]=search(nums,target,firstoccu=false);
		System.out.println(a[0]);
		System.out.println(a[1]);
		
	}
}

/* OUTPUT

1
4

*/
