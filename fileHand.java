package java_Project;

import java.io.File;

public class fileHand {
	public  static void main(String args[]) {
		File f1=new File("C:\\Users\\sahaa\\eclipse-workspace\\java_Project\\src\\java_Project\\sec_mssg.txt");
		if(f1.exists()) {
			System.out.println("it exists");
		}
		else {
			System.out.println("does not exist");
		}
	}
}
