/*
    Title:  Coding Ninjas - floor and ceiling
    PL: https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401
    Topic: Binary Search
    Input: [1,3,5,6] & target=2
    Output: 1 //index
    Author: Vedant Sawant
    Date: 30/03/2024
*/


public class Q_Ceil_Floor_CN
{
    public static int get_ceil(int arr[],int x)
    {
      int low=0;
      int high=arr.length-1;
      int ans=-1;
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(arr[mid]<=x)
        {
          ans=arr[mid];
          low=mid+1;
        }
        else
        {
          high=mid-1;
        }
      }
      return ans;
    }
    public static int get_floor(int arr[],int x)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
          int mid=(low+high)/2;
          if(arr[mid]>=x)
          {
            ans=arr[mid];
            high=mid-1;
          }
          else
          {
            low=mid+1;
          }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,4,7,8,8,10};
        int target=7;
        System.out.println(get_ceil(arr,target));
        System.out.println(get_floor(arr,target));
    }       
}
