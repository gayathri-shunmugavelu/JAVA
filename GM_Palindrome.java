package javapackage;

import java.util.Scanner;

public class GM_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Original, Reverse="";
System.out.println("Enter number or String");
Original = System.console().readLine();
System.out.println(Original);
		/*
		 * Scanner in=new Scanner(System.in);
		 * System.out.println("Enter number or String"); Original = in.nextLine();
		 * Original =in.nextLine(); in.close();
		 */
int Length = Original.length();
System.out.println(Length);
for(int i=Length-1;i>=0;i--)
{
	Reverse = Reverse + Original.charAt(i);
	System.out.println("The Reversed String is " + Reverse);
}
System.out.println("The Reversed String is " + Reverse);

if(Original.equals(Reverse))

	System.out.println("The String is Palindrome" + Reverse  + Original);
	

else
	System.out.println("The String is not Palindrome" + Reverse +Original);
	}

}
