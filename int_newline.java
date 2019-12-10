package javapackage;
// unicode with new line that prints hello
// String equals and ==
public class int_newline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//hello
		//\u000d		System.out.println("hello");
		
		// one == two checks if the value is same memory
		//one.equals two would compare the value
		String one = "Random";
		String two = "Random";
		if (one == two) {
			System.out.println("the string memory is equal");
		}
		
		else
			System.out.println("The string memory is not equal");
	}

}
