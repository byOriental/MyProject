package javase.cls.libraries.Internet;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternetProgram {

	public static void main(String[] args) {
		//指定国家语言
		Locale zhLoc=new Locale("zh","CN");//表示中国地区
		Locale enLoc=new Locale("en","US");
		Locale frLoc=new Locale("fr","FR");
		//获取属性文件
		ResourceBundle zhrs=ResourceBundle.getBundle("Message", zhLoc);
		ResourceBundle enrs=ResourceBundle.getBundle("Message", enLoc);
		ResourceBundle frrs=ResourceBundle.getBundle("Message", frLoc);
		
		//读取文件内容
		String zh=zhrs.getString("info");
		String en=enrs.getString("info");
		String fr=frrs.getString("info");
		
		//内容输出
		System.out.println("中国语言："+zh+"\n英语："+en+"\n法语"+fr);
		
		// TODO Auto-generated method stub

	}

}
