/*
    Title: We are given with a sorted array(take from user). We don't know it is sorted
           in ascending order or descending order. Take array input from user 
			,if element is found return its index or -1 if not found.
    Topic: Binary Search
    Input: [2,3,4,5,6]    target=2
    Output: 0
    Author: Vedant Sawant
    Date: 30/12/2023
 */

import java.util.Scanner;
public class C_Order_Agnostic 
{
    
    public static void array_type(int arr[],int target)
    {
        if(arr[0]<=arr[arr.length-1])
        {
            System.out.println("--- Array is in Ascending order");
            System.out.println("Target Found at Location: "+ascending_sort(arr,target));
        }
        else
        {
            System.out.println("--- Array is in Descending order");
            System.out.println("Target Found at Location: "+descending_sort(arr,target));
        }
    }
    public static int ascending_sort(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(target>arr[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }
        return -1;
    }
    public static int descending_sort(int arr[],int target)
    {
        int high=0;
        int low=arr.length-1;
        while(high<=low)
        {
            int mid=high+(low-high)/2;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Array Elements You want?: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("--- Array Input Done");
        System.out.println("What Element You want to search in array?: ");
        int target=sc.nextInt();
        array_type(arr,target);
    }
}
