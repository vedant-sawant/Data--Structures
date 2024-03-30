/*
    Title: 35 Leetcode - Search Insert Position
    PL: https://leetcode.com/problems/search-insert-position/description/
    Topic: Binary Search
    Input: [1,3,5,6] & target=2
    Output: 1 //index
    Author: Vedant Sawant
    Date: 30/03/2024
*/


public class P_Search_Insert_Position_35L 
{
    public static int search_insert(int arr[],int target)
    {
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
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
    int arr[]={1,1,2,3,4};
    int target=2;
    System.out.println(search_insert(arr,target));
    
}
     
}
