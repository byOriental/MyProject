package javase.cls.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("�ٶ�", "www.baidu.com");
		pro.setProperty("�ȸ�", "www.google.com");
		pro.setProperty("�Ա�", "www.taobao.com");

		File f = new File("d:" + File.separator + "area.properties");
		try {
			pro.store(new FileOutputStream(f), "Area Info");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
