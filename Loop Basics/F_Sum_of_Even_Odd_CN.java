/*
    Title: Sum of even & odd
	Problem: Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.    
    PL: https://www.geeksforgeeks.org/problems/the-nth-fibonnaci3150/1
    Topic: Loops/ Fibonacci Series
    Input:132456  
    Output: 12 9  (The sum of even digits = 2 + 4 + 6 = 12 The sum of odd digits = 1 + 3 + 5 = 9)
    Author: Vedant Sawant
    Date: 27/03/2024
*/

class F_Sum_of_Even_Odd_CN
{
    public static void sum_even_odd(int n) //12345
    {

        int digit=0;
        int evenSum=0;
        int oddSum=0;
        while(n>0)
        {
            digit=n%10;
            if(digit%2==0)
            {
                evenSum+=digit;
            }
            else
            {
                oddSum+=digit;
            }
            n=n/10;
        }
        System.out.println("Even Sum is"+evenSum);
        System.out.println("Odd Sum is"+oddSum);
    }

    public static void main(String[] args) {
        int n=132456;
        sum_even_odd(n);
        }
}