*
    Title: Search a Element return element or 1-1 if element is not found. 
    Topic: Binary Search
    Input: [2, 5, 7, 1, 5]
    Output: Target Found at Location :4 , Count is 2
    Author: Vedant Sawant
    Date: 23/12/2023
*/
public class binarys
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
		int target=9;
		System.out.println(binary(arr,target));
	}
} 