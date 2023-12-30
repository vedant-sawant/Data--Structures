/*
    Title: Search a Element
    Topic: Linear Search
    Input: 2,3,4,5,6    item=5
    Output: item found at index 3
    Author: Vedant Sawant
    Date: 22/12/2023
 */
import java.util.*;
public class A_Linear_Search_Code
{
	public static int linear(int item,int arr[])
	{
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		

		//array 
		int arr[]=new int[5];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++)  //no need of giving length() as it is method
		{
			arr[i]=sc.nextInt();
		}

		//take input element
		System.out.println("Enter Item To be searched for: ");
		int item=sc.nextInt();

		//calling of function
		int index=linear(item,arr);

		if(index==-1)
		{
			System.out.println("Item Not Found");
		}
		else
		{
			System.out.println("Item Found at Location: "+index);
		}
	}
}

/* OUTPUT

Enter Array Elements:
2
3
4
1
2
Enter Item To be searched for:
1
Item Found at Location: 3

*/