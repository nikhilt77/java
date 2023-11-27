import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		Scanner P=new Scanner(System.in);
		System.out.println("Enter File name:");
		String filename=P.nextLine();
		File f=new File(filename);
		try {
			if(f.createNewFile()) {
				System.out.println("File created at:"+f.getAbsolutePath());
			}
			else {
				System.out.println("File already created");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		try {
			String str;
			FileOutputStream fos=new FileOutputStream(f);
			System.out.println("Enter String to input into file:");
			str=P.nextLine();
			for(int i=0;i<str.length();i++) {
				fos.write(str.charAt(i));
			}
			fos.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		try {
			FileInputStream fis=new FileInputStream(filename);
			while(true) {
				int c=fis.read();
				if(c==-1) {
				break;
			}
			else {
				System.out.print((char)c);
			}
				System.out.println();
				fis.close();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
