package Java_Bas;

public class StringClass {
	public static void main(String args[]) {
		String str=new String("Hello");
	
	System.out.println(str);
	System.out.println(str.length());
	str=str.concat("Welcome");
	System.out.println(str);
	System.out.println(str.indexOf('o'));
	System.out.println(str.charAt(2));
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str.trim());
	System.out.println(str.replace("Welcome", "How Are You"));
	System.out.println(str.compareTo("hello"));
	}
}
