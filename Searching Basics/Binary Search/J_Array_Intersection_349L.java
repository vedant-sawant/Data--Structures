/*
    Title: Leetcode 349 - Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
    PL: https://leetcode.com/problems/intersection-of-two-arrays/description/
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]
    Author: Vedant Sawant
    Date: 08/01/2024
*/

import java.util.HashSet;
import java.math.*;
class J_Array_Intersection_349L
 {
    public static void binary(int nums1[],int nums2[])
    {
        int l1=nums1.length;
        int l2=nums2.length;
        int m=Math.max(l1,l2);
        if(l1>l2)
        {
            
        }
        int low=0;
        int high=m;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if()
        }
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
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};
        inter(nums1,nums2);
    }
}

