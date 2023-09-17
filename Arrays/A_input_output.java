/*
    Title: Java Program to Take array as input from user and print.
    Topic: Array
    Input: 1 2 3 4 
    Output: 1 2 3 4

    Author: Vedant Sawant
    Date: 17/09/2023
 */

import java.util.*;
class A_input_output
{
    // make sc as static because it should be accessible by all instances of class
    static Scanner sc=new Scanner(System.in);

    public static void input_output()
    {   
        //take input as how many elements
        System.out.println("How much Elements in array? ");
        int elements=sc.nextInt();
        int arr[]=new int[elements];

        //take input of array
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }


        //print output of array
        System.out.print("Array Values are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(i+" , ");
        }
    }

    
    public static void main(String[] args) 
    {
        input_output();
      
    }

}