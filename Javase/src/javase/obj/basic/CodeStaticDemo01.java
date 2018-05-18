package javase.obj.basic;

/**
 * 
*@Title:StaticDemo
*@Description:代码块：主类静态方法>静态块>构造快>构造方法
*@author:Administrator
*@date:2017年8月28日 下午12:50:07
 */

class StaticDemo{
	{
		System.out.println("构造快");//3
	}
	public StaticDemo(){
		System.out.println("构造方法");//4
	}
	static{
		System.out.println("静态块");//2
	}
	
}
public class CodeStaticDemo01 {
	static{
		System.out.println("主方法中_静态块"); //最先执行1
	}

	public static void main(String[] args) {
		StaticDemo staticDemo=new StaticDemo();
		// TODO Auto-generated method stub

	}

}
