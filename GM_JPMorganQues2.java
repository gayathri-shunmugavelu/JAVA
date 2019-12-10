package javapackage;

public class GM_JPMorganQues2 {
public static void main(String argz[]) {
		
		String numInString = "21462675756";
		String newString="", symbol="";
		int strlen = numInString.length();
		Integer[] num = new Integer[strlen];
		for(int i=0;i<strlen;i++) {
			num[i]=Character.getNumericValue(numInString.charAt(i));
		}
		
		for(int j=0;j<num.length-1;j++) {
		symbol = Symbol(num[j],num[j+1]);
		newString = newString+ num[j] + symbol;
		}
		newString = newString + num[num.length-1];
		System.out.println("OldString :"+ numInString);
		System.out.println("NewString :"+newString);
	}
	
	public static String Symbol(int a,int b) {
		String str = "";
		if(a%2==0 && b%2==0) {
			str ="*";
		}
		else if(a%2!=0 && b%2!=0) {
			str = "-";
		}
		else
		{
			str = "";
		}
		return str;
	}
}