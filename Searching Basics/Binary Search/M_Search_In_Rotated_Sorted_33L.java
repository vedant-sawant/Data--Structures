/*
    Title: Leetcode 33. Search in Rotated Sorted Array
    PL: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
    Topic: Binary Search
    Input: [1,2,3,4,5,3,1] & target=3
    
    Output: 2
    Author: Vedant Sawant
    Date: 05/02/2024
*/
public class M_Search_In_Rotated_Sorted_33L
{
    public static void main(String[] args) 
    {
       int arr[]={4,5,6,7,0,1,2};
       int target=5;
       int pivot=pivotfind(arr);
       System.out.println("Pivot Element Found at: "+pivot);
       int first=binarysearch(arr,target,0,pivot);
       if(first!=-1)
       {
            System.out.println("Target Found at Location: "+first);
       }
       else
       {
            System.out.println("Target Found at Location: "+binarysearch(arr,target,pivot+1,arr.length-1));
       }
    }
    public static int pivotfind(int arr[])
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mid<high && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>low && arr[mid]<arr[mid-1])
            {
                return arr[mid]-1;
            }
            else if(arr[low]>=arr[mid])
            {
                high=mid-1;
            }
            else if(arr[low]<arr[mid])
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static int binarysearch(int arr[],int target,int low,int high)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
}