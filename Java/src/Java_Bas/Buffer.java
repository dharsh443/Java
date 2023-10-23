package Java_Bas;
import java.io.*;
import java.io.BufferedReader; 

public class Buffer {
	public static void main(String args[])throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		int a=Integer.parseInt(br.readLine());
		String b=(br.readLine());
		System.out.println(b);
		System.out.println(a);
	}

}
