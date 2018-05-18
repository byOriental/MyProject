package javase.obj.advanced;

import java.awt.print.Printable;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * 
*@Title:PolDemo02
*@Description:多态——父类对象接收所有对象（子类对象指向父类对象）
*@author:Administrator
*@date:2017年8月28日 下午10:35:25
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
	public static void print(One one){  //父类对象接收子类对象
		one.print1();
		one.print2();
	}

}
