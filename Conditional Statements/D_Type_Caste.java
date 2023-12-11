/*
    Title: Java Program To Demonstrate Type Casting
    Topic: Scanner Class Input Output in java
    Input: user inputs
   	byte -> short -> int -> Float -> double -> long
    Output: displays output
    Author: Vedant Sawant
    Date: 11/12/2023
 */
import java.util.Scanner;
public class D_Type_Caste {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();      //Takes Input a String
		int b=sc.nextInt();	//Takes Integer as Input
		char ab='a';
		int as=(int)ab;
		System.out.println(as);
	}
}


/* OUTPUT

 PS D:\Codes\Data Structures\Data--Sructures\Conditional Statements> java .\D_Type_Caste.java
qw
12
97

*/