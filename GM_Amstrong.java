package javapackage;

public class GM_Amstrong {
public static void main(String[] args) {
	int c=0,a,temp;
	int n=153;
	temp=n;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		
	}
	
	if(temp == c) {
		System.out.println(temp + " is a armstrong strong number");}
		else {
		System.out.println(temp + "is not an armstrong number");
	}
}

}
