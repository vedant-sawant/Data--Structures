/*
    Title: Floor of a Number
	Problem: Given arr[] sorted. FInd target number or smallest number than target.
    Topic: Binary Search
    Input: [2, 5, 7, 1, 5]   Target=6
    Output: 5
    Author: Vedant Sawant
    Date: 30/12/2023
*/

public class E_Floor_of_Number
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
			if(target>arr[mid])
			{
				low=mid+1;	
			}
			else
			{
				high=mid-1;
			}
		}
		return arr[high];
	}
	public static void main(String args[])
	{
		int arr[]={1,2,4,5,7,9,11};
		int target=8;
		System.out.println(ceiling(arr,target));
	}

}

/* OUTPUT FOR TARGET 8 IN arr[]={1,2,4,5,7,9,11}

   7
 */