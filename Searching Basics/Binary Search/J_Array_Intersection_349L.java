/*
    Title: Leetcode 349 - Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
    PL: https://leetcode.com/problems/intersection-of-two-arrays/description/
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]
    Author: Vedant Sawant
    Date: 08/01/2024
*/

import java.util.Arrays;
import java.util.HashSet;
import java.math.*;
class J_Array_Intersection_349L
 {
    public static int[] binary(int nums1[],int nums2[])
    {
        //swap nums1 with nums2 if size of nums1 is large than 2
        //We will make nums1 as small length for binary search
        if(nums1.length > nums2.length)
        {
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        Arrays.sort(nums2);  
        HashSet<Integer> s1=new HashSet<>();
        //we will pass this large array nums2 to binary search and check one by one element with small array
        for(int i=0;i<nums1.length;i++)
        {
            if(binary_search(nums2, nums1[i]))
            {
                s1.add(nums1[i]);
            }
        }

        //convert the hashset in array and return it.
        /*for(int i : s1)
        {
            System.out.println(i);
        }*/


        int ans[]=new int[s1.size()];
        int i=0;
        for(int n : s1)
        {
            ans[i]=n;
            i++;
        }

        return ans;

        



        
    }
    public static boolean binary_search(int arr[],int target)
    {
            int low=0;
            int high=arr.length-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(target==arr[mid])
                {
                    return true;
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
            return false;
    }
    
    public static void brute_force(int nums1[],int nums2[])
    {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        //add elements to first set
        for(int i : nums1)
        {
            s1.add(i);
        }

        
        for(int i : nums2)
        {
            if(s1.contains(i))
            {
                s2.add(i);
                s1.remove(i);
            }
        }

        int arr[]=new int[s2.size()];
        int index=0;
        for(int n : s2)
        {
            arr[index++]=n;
        }
        for(int i : arr)
        {
            System.out.print(i+ " ");
        }

    }

  
    public static void main(String[] args) {
        int nums1[]={1,2};
        int nums2[]={2,1,2};
        //brute_force(nums1,nums2);
        int result[]= binary(nums1,nums2);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(" "+result[i]);
        }
    }
}

