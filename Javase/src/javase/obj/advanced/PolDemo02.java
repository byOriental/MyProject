package javase.obj.advanced;

import java.awt.print.Printable;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * 
*@Title:PolDemo02
*@Description:��̬�����������������ж����������ָ�������
*@author:Administrator
*@date:2017��8��28�� ����10:35:25
 */
class One{
	public void print1(){
		System.out.println("one+++++");
	}
	public void print2(){
		this.print1();
	}
}
class Two extends One{
	public void print1(){
		System.out.println("Two++++++");
	}
	public void print3(){
		System.out.println("Two222++++++++++");
	}
}
class Three extends One{
	public void print1(){
		System.out.println("Three+++++");
		
	}
	public void print5(){
		System.out.println("Three333+++++++++++");
	}
}
public class PolDemo02 {
	public static void main(String[] args) {
		print(new Two());
		print(new Three());
	}
	public static void print(One one){  //�����������������
		one.print1();
		one.print2();
	}

}
