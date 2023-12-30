/*
    Title: Find a Target Element From Given sorted array(descending order) 
			,if element is found return its index or -1 if not found.
    Topic: Linear Search
    Input: 2,3,4,5,6    item=5
    Output: item found at index 3
    Author: Vedant Sawant
    Date: 30/12/2023
 */

 public class B_Des_Binary_Search
 {
    public static int des_binary(int arr[],int target)
    {
        int high=0;
        int low=arr.length-1;

        while(high<=low)
        {
            int mid=low+(high-low)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(target<arr[mid])
            {
                high=mid+1;
            }
            else
            {
                low=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={65,60,50,55,45,34,23,2};
        int target=2;
        System.out.println(des_binary(arr,target));
    }
 }

 /*
  OUTPUT
  
  7

  */