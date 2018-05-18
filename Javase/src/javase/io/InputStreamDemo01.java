package javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo01 {

	public static void main(String[] args) throws Exception {
		// 1.ָ����ȡ�ļ�
		File f = new File("d:" + File.separator + "text.txt");
		System.out.println(f);
		// 2.����ʵ����
		InputStream in = null;
		in = new FileInputStream(f);

		// 3.��ȡ�ļ�
		byte b[] = new byte[(int) f.length()];
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) in.read();
		}
		String str = new String(b);
		// 4.�ر�������
		in.close();
		System.out.println(str);
	}

}
