package Java_Bas;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[]args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
		if(c%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}

}
