package javapackage;

public class GM_MaxMinUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //int[] minmax ={2,34,56,76,76,86,32,1,3,98};
 minmax(new int[] {3,4,5,1,2});
	}

	private static void minmax(int[] array) {
		int arraylargest=array[0];
		int arraysmallest=array[0];
		int secondlargest=array[0];
		for (int i=0;i<array.length;i++) {
			if(array[i]>arraylargest) {
				secondlargest=arraylargest;
				arraylargest=array[i];
				
			}
			else
			
				if(array[i]<arraysmallest) {
					arraysmallest=array[i];
				}	
			
				else
					if(array[i]>secondlargest && array[i]!=arraylargest) {
						secondlargest=array[i];
					}
		}
		System.out.println("largest number of the array is"+arraylargest);
		System.out.println("smallest number of the array is"+arraysmallest);
		System.out.println("second largest number of the array is"+secondlargest);
		
	}
	}
