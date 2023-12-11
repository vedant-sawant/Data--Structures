/*
    Title: Java Program To take input from user and use of scanner class
    Topic: Scanner Class Input Output in java
    Input: user inputs
    Output: displays output
    Author: Vedant Sawant
    Date: 11/12/2023
 */
import java.util.Scanner;
public class B_Input_Output{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();      //Takes Input a String
		int b=sc.nextInt();	//Takes Integer as Input
		double ab=12.3647637476;
		System.out.println(ab);
	}
}


/* OUTPUT

 PS D:\Codes\Data Structures\Data--Sructures\Conditional Statements> java .\B_Input_Output.java
Heya
12
12

*/