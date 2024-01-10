/*
    Title: Leetcode 2540. Minimum Common Value
    PL: https://leetcode.com/problems/minimum-common-value/description/
    Topic: HashSet / Binary Search
    Input: nums1 = [1,2,3], nums2 = [2,4]
    Output: 2
    Author: Vedant Sawant
    Date: 10/01/2024
*/
import java.util.*;

public class K_Minimum_Common_Value_2540L
{
	public static int hashset_solved(int nums1[],int nums2[])
	{
		HashSet<Integer> s1=new HashSet<>();
		for(int i : nums1)
		{
			s1.add(i);
		}
		
		int ans=-1;
		for(int i : nums2)
		{
			if(s1.contains(i))
			{
				ans=i;
				break;   //break as in first iteration we find element as array is sorted
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		int nums1[]={1,2,3};
		int nums2[]={2,4};
		System.out.println(hashset_solved(nums1,nums2));
	}
}