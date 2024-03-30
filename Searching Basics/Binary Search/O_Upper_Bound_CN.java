/*
    Title: Coding Ninjas - Implement Upper Bound
    PL: https://www.naukri.com/code360/problems/implement-upper-bound_8165383
    Topic: Binary Search
    Input: [1,2,2,3,3,5] & x=2
    Output: 3
    Author: Vedant Sawant
    Date: 29/03/2024
*/

class O_Upper_Bound_CN
{
    public static int upper_bound(int x,int arr[])
    {
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
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
        int arr[]={1,2,3,4};
        int x=3;
        System.out.println(upper_bound(x,arr));
    }
}

