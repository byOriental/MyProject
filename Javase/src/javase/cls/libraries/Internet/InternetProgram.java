package javase.cls.libraries.Internet;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternetProgram {

	public static void main(String[] args) {
		//ָ����������
		Locale zhLoc=new Locale("zh","CN");//��ʾ�й�����
		Locale enLoc=new Locale("en","US");
		Locale frLoc=new Locale("fr","FR");
		//��ȡ�����ļ�
		ResourceBundle zhrs=ResourceBundle.getBundle("Message", zhLoc);
		ResourceBundle enrs=ResourceBundle.getBundle("Message", enLoc);
		ResourceBundle frrs=ResourceBundle.getBundle("Message", frLoc);
		
		//��ȡ�ļ�����
		String zh=zhrs.getString("info");
		String en=enrs.getString("info");
		String fr=frrs.getString("info");
		
		//�������
		System.out.println("�й����ԣ�"+zh+"\nӢ�"+en+"\n����"+fr);
		
		// TODO Auto-generated method stub

	}

}
