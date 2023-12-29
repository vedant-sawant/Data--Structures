/*
    Title: Search a Element return element or 1-1 if element is not found. 
    Topic: Binary Search
    Input: [2, 5, 7, 1, 5]
    Output: Target Found at Location :4 , Count is 2
    Author: Vedant Sawant
    Date: 23/12/2023
*/

public class B_Ceiling_of_Number
{
	public static int ceiling(int arr[],int target)
	{ //1,2,4,5,7,9,11
	  //0,1,2,3,4,5,6
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(target==arr[mid])
			{
				return arr[mid];
			}
			if(target>mid)
			{
				low=mid+1;	
			}
			else
			{
				high=mid-1;
			}
		}
		return arr[low];
	}
	public static void main(String args[])
	{
		int arr[]={1,2,4,5,7,9,11};
		int target=8;
		System.out.println(ceiling(arr,target));
	}

}