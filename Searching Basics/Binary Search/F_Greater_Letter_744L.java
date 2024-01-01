/*
    Title: LeetCode 744. Find Smallest Letter Greater Than Target
	Problem: You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
    Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
    Topic: Binary Search
    Input: letters = ["c","f","j"], target = "a"
    Output: "c"
    Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
    Author: Vedant Sawant
    Date: 30/12/2023
*/

public class F_Greater_Letter_744L
{
    public static char nextGreatestLetter(char[] letters, char target)
    {
	int low=0;
	int high=letters.length-1;
        while(low<=high)
	{
		int mid=(low+high)/2;
		if(target>=letters[mid])
		{
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
	}
	return letters[low % letters.length];
        
    } 
    public static void main(String args[])
    {
        char letters[]={'a','b','c'};
        char target='c';
        char a=nextGreatestLetter(letters,target);
        System.out.println(a);
    }
}

/*   OUTPUT

a

*/