/*
    Title: Java Program to find number of occurance of the target.
    Topic: Array
    Input: 1 2 3 4 , number=4 
    Output: 1
    Author: Vedant Sawant
    Date: 18/09/2023
 */

public class D_number_of_occurance 
{
	public static int occurance(int arr[],int target)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{	
		int arr[]={1,2,3,1,4,2,1,1};
		int target=1;
		System.out.println(occurance(arr,1));
	}    
}


/*   OUTPUT
4
*/