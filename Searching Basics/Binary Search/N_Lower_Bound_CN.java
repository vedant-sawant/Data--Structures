/*
    Title: Coding Ninjas - Implement Lower Bound
    PL: https://www.codingninjas.com/studio/problems/lower-bound_8165382
    Topic: Binary Search
    Input: [1,2,2,3,3,5] & x=4
    Output: 5
    Author: Vedant Sawant
    Date: 29/03/2024
*/

class N_Lower_Bound_CN
{
    public static int lower_bound(int x,int arr[])
    {
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]>=x)
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
        int x=1;
        System.out.println(lower_bound(x,arr));
        
    }
}

/*
Input: 1 2 2 3
       2
       
Ouput: 1 //index of the element 2
 
 
 */