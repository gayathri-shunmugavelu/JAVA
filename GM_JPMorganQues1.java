package javapackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class GM_JPMorganQues1 {
	

			public static void main(String argz[]) {
				
			int[] number = {9,3,2,7,2,5,3,8};
				//int[] number = {0,1,1,1,0,0,1,1};
				int K=4;
				number= sort(number);
				
				Set<Integer> setInt = removeDupInIntArray(number);
				List<Integer> list = new ArrayList<Integer>(setInt);
				Integer value = null;
				if(K<list.size())
				value = list.get(K-1);
				System.out.println("KthElement : "+value);
			}
			
			public static int[] sort(int[] num) {
				int temp;
				for(int i=0;i<num.length;i++) {
					for(int j=i+1;j<num.length;j++) {
						if(num[i]>num[j]){
							temp = num[i];
							num[i]=num[j];
							num[j]=temp;
						}
					}
					
				}
				return num;
			}
			
			public static Set<Integer> removeDupInIntArray(int[] a){
				int end = a.length;
				Set<Integer> set = new HashSet<Integer>();

				for(int i = 0; i < end; i++){
				  set.add(a[i]);
				}
		        return set;
			}
	}