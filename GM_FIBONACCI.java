package javapackage;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class GM_FIBONACCI {

		public static void main(String args[]) throws IOException  
		{    
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		
		 int num, a =0, b=0, c=1;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the number of times you want to have the series");
		 num = in.nextInt();
		 System.out.println("Fibonacci Series of the number" + num + "is");
		 for(int j =0 ; j <= num ; j++)
		 {
			a = b;
			b = c;
			c = a+b;
			System.out.println(a + " ");
		 }
		
		DataInputStream dis = new DataInputStream(System.in);
		int k = dis.readInt();
	System.out.println("Enter your number" + k);
	for(int l =0; l<= k ; l++) {
int e=0,f=1;	
		int g=e+f;
		e=f;
		f=g;
		System.out.println();
		}
		}}