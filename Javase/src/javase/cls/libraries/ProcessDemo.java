package javase.cls.libraries;

import java.io.IOException;

/**
 * 
*@Title:ProcessDemo
*@Description:����ʱ����Runtime��ϵͳ����Process
*@author:Administrator
*@date:2017��9��12�� ����9:33:18
 */
public class ProcessDemo {

	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		Process pr=null;
		try {
			pr=rt.exec("notepad.exe");//Runtime����ֵΪProcessϵͳ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);//��������5��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pr.destroy();//�����˽���
		// TODO Auto-generated method stub

	}

}
