package javase.arrayMethod;

/**
 * 
*@Title:methodDemo04
*@Description:return方法中断（类似break中断循环）
*@author:Administrator
*@date:2017年8月14日 下午1:37:36
 */
public class methodDemo04 {

	public static void main(String[] args) {
		System.out.println("程序开始——————————————————");
		method(99,99);
	    System.out.println("程序结束————————————————————");

	}

	private static void method(int i, int j) {
		int temp;
		temp=i+j;
		System.out.println("方法开始————————————————");
		if(temp==198){
			return;//结束掉整个方法
		}
		System.out.println("方法结束————————————————");
		
	}

}
