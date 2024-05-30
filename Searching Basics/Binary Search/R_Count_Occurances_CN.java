/*
    Title:  Coding Ninjas - Count Occurances
    PL: https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456
    Topic: Binary Search
    Input: 'n' = 7, 'x' = 3  'arr' = [1, 1, 1, 2, 2, 3, 3]
    Output: 2
    Author: Vedant Sawant
    Date: 30/03/2024
*/

public class R_Count_Occurances_CN
{
    public static void main(String args[]) 
    {
        int arr[]={1,2,3,4,5};
        int target=3;
        int ans=binary_search(target,arr);
        System.out.println(ans);
    }
    public static int binary_search(int target,int arr[])
    {
            int low=0;
            int high=arr.length-1;
            int count=0;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(arr[mid]==target)
                {
                    count++;
                }
                else if(target>arr[mid])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            return count;
    }
}