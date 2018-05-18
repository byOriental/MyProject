package javase.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo01 {

	public static void main(String[] args) throws Exception {
		// 1.指定输出文件
		File fl = new File("d:" + File.separator + "text.txt");
		// 2.输出流子类
		OutputStream out = null;
		out = new FileOutputStream(fl);
		// 3.输出内容
		String str = "hello world!!!";
		byte bt[] = str.getBytes();
		out.write(bt);
		// 4.关闭输出流
		out.close();

	}

}
