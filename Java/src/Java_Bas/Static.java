package Java_Bas;
import java.lang.*;
public class Static {

	
		// TODO Auto-generated method stub
		static int a=10;
		static void display()
		{
			System.out.println("This is a Static Method");
		}
		static {
			System.out.println("This is staticblock");
		}
	
		public static void main(String[]args) {
			System.out.println(a);
			display();
		}
	

	}


