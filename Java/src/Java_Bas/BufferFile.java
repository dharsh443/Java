package Java_Bas;
import java.io.*;

public class BufferFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 FileReader fr = new FileReader("D:\\java\\hello.txt");
	        BufferedReader br = new BufferedReader(fr);
	        String str = br.readLine();
		System.out.println(str);
		

	}

}
