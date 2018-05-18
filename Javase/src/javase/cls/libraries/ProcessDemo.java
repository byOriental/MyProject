package javase.cls.libraries;

import java.io.IOException;

/**
 * 
*@Title:ProcessDemo
*@Description:运行时进程Runtime与系统进程Process
*@author:Administrator
*@date:2017年9月12日 下午9:33:18
 */
public class ProcessDemo {

	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		Process pr=null;
		try {
			pr=rt.exec("notepad.exe");//Runtime返回值为Process系统进程
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);//让其运行5秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pr.destroy();//结束此进程
		// TODO Auto-generated method stub

	}

}
