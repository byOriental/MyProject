package javase.cls.collection;

/**
 * ����Զ��󡪡��������˼ά��ͨ��api�ĵ����г����д
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiseDemo02 {

	public static void main(String[] args) {
		// ָ���ļ�
		File f = new File("d:" + File.separator + "area.properties");
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ��ȡpropertiseֵ
		System.out.println(pro.getProperty("�ٶ�"));
	}

}
