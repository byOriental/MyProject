package javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo01 {

	public static void main(String[] args) throws Exception {
		// 1.指定读取文件
		File f = new File("d:" + File.separator + "text.txt");
		System.out.println(f);
		// 2.子类实例化
		InputStream in = null;
		in = new FileInputStream(f);

		// 3.读取文件
		byte b[] = new byte[(int) f.length()];
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) in.read();
		}
		String str = new String(b);
		// 4.关闭输入流
		in.close();
		System.out.println(str);
	}

}
