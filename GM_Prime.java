package javapackage;

import java.util.Scanner;

public class GM_Prime {
public static void main(String[] args)
{
	int temp,num;
	boolean isPrime=true;
	Scanner in=new Scanner(System.in);
	num=in.nextInt();

	for (int i=2;i<=num/2;i++) {
		temp=num%i;
		System.out.println("temp" + temp);
		if(temp == 0) {
			isPrime = false;
			break;
		}
	}
	if(isPrime)
		System.out.println(num + "is a prime number");
	else
		System.out.println(num + "is not a prime number");
}
}
