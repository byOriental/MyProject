package javase.exception;
/**
 * 
*@Title:ExceptionDemo01
*@Description:Throwable是Exception、Error的父类,Error为虚拟机异常（不可捕捉）,Exception为程序运行时异常
*@author:Administrator
*@date:2017年9月9日 下午8:11:39
 */
public class ExceptionDemo01 {
	public static void main(String args[]){
		int i=8;
		int j=0;
		
		try {
			int m=i/j;
			System.out.println(m);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("出现异常了:"+e);
		}	
	}

}
