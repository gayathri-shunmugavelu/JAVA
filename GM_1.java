package javapackage;

public class GM_1 {

		   public static long fib(long n) {
			   long a ;
		      if ((n == 0) || (n == 1))
		         return n;
		      else
		    	a =  fib(n - 1) + fib(n - 2);
		      System.out.println("a value is" + a);
		         return a;
		   }
		   public static void main(String[] args) {
		      System.out.println("The 0th fibonacci number is: " + fib(0));
		   /*   System.out.println("The 7th fibonacci number is: " + fib(7));*/
		      System.out.println("The 12th fibonacci number is: " + fib(4));
		   }
		}

