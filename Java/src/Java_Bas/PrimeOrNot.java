package Java_Bas;
import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a/3!=0 || a/5!=0 ||a/7!=0){
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT PRIME");
		}
	}

}
