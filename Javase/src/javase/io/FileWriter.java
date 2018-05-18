package javase.io;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		File f = new File("d:" + File.separator + "text.txt");
		Writer out = null;
		out = new java.io.FileWriter(f);
		String str = "helloworld,baiyang!!!";
		out.write(str);
		out.close();
	}

}
