package javase.cls.collection;

/**
 * 万物皆对象——面向对象思维，通过api文档进行程序编写
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiseDemo02 {

	public static void main(String[] args) {
		// 指定文件
		File f = new File("d:" + File.separator + "area.properties");
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 读取propertise值
		System.out.println(pro.getProperty("百度"));
	}

}
