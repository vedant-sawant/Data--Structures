/*
    Title: Leetcode 1095. Find in Mountain Array
    PL: https://leetcode.com/problems/find-in-mountain-array/description/
    Topic: Binary Search
    Input: [1,2,3,4,5,3,1] & target=3
    
    Output: 2
    Author: Vedant Sawant
    Date: 01/02/2024
*/
import java.util.Scanner;
public class L_Find_in_MountainArr_1095L
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=3;
        /* Take Array Input From User and Display Array */
        System.out.println("Enter Array Length: ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter Array Numbers: ");
        for(int i=0;i<length;i++)
        {
          
            arr[i]=sc.nextInt();
        }

        System.out.println("You entered following elements: ");
        for(int i=0;i<length;i++)
        {
            System.out.print(" ; "+arr[i]);
        }

        System.out.println();
        /* Find Peak Element in Mountain Array */
        int peak=peak_element(arr);
        System.out.println("Peak Element in the array is present at index: "+peak);

        /* Now apply Binary search to asc and desc order array before peak and after peak */
        int start=0;
        int end=peak;
        int found=ascbinarysearch(arr,target,start,end);
        System.out.println("AES Element in the array is present at index: "+found);
        if(found==-1)
        {
            int founddes=descbinarysearch(arr,target,peak+1,length-1);
            System.out.println("DES Element in the array is present at index: "+founddes);
        }
        

    }    
    public static int peak_element(int arr[])
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(low==high)
            {
                return low;
            }
            else if(arr[mid]>arr[mid+1])
            {
                high=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static int ascbinarysearch(int arr[],int target,int low,int high)
    {
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(target==arr[mid])
            {
                return mid;
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
        return -1;
    }
    public static int descbinarysearch(int arr[],int target,int high,int low)
    {
        while(high<=low)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if (target > arr[mid]) 
            {
                high = mid - 1; 
            } 
            else 
            {
                low = mid + 1; 
            }
        }
        return -1;
    }
}
