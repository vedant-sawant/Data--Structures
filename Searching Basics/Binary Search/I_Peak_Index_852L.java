/*
    Title: Leetcode 852 - Peak Index in a Mountain Array / Bitonic Array
    PL: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    Topic: Binary Search
    Input: nums = [0,1,2,3,1,0]
    Output: 3
    Author: Vedant Sawant
    Date: 08/01/2024
*/

class I_Peak_Index_852L
 {
    public static int peakIndexInMountainArray(int[] arr) 
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(low==high)
            {
                return low;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}

/* OUTPUT
3
*/