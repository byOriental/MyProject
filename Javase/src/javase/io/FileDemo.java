package javase.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("d:" + File.separator);
		File[] fl = f.listFiles();
		for (int i = 0; i < fl.length; i++) {
			System.out.println(fl[i]);
		}
	}
}
