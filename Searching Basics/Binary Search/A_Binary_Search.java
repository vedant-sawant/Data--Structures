/*
    Title: Find a Target Element From Given sorted array(ascending order) 
			,if element is found return its index or -1 if not found.
    Topic: Binary Search
    Input: [2, 5, 7, 1, 5]  Target =2
    Output: 0 
    Author: Vedant Sawant
    Date: 29/12/2023
*/
public class A_Binary_Search
{
	public static int binary(int arr[],int target)
	{	
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			if(target>arr[mid])
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
		int arr[]={2,4,7,8,9,12,34};
		int target=10;
		System.out.println(binary(arr,target));
	}
} 

/*
 OUTPUT
 4
  
 */