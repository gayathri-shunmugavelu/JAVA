package javapackage;

public class GM_ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayname = new int[4];
		arrayname[1]=10;
		arrayname[2]=20;
		arrayname[0]=0;
		arrayname[3]=40;
		
		for(int i=0;i<arrayname.length;i++) {
			System.out.println(i+":"+arrayname[i]);}
			//missing number in a not duplicated array array;
			
			int[] arraymissing = {10,9,6,4,7,3,5,1,2};
			int n;
			int summissing=0;
			n=arraymissing.length+1;
			int Sum=(n*(n+1))/2;
			System.out.println("Sum of the total array is"+Sum);
			for(int j=0;j<arraymissing.length;j++) {
				summissing=summissing+arraymissing[j];
				System.out.println("Sum of the missing array is"+summissing);
			}	
				int Missingnumber=Sum-summissing;
				System.out.println("Missing number is"+Missingnumber);
			
			
		}
	}


