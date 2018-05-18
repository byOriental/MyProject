package javase.obj.advanced;

/**
 * 
*@Title:WrapperDemo01
*@Description:自动拆箱与自动装箱
*@author:Administrator
*@date:2017年9月13日 上午11:16:01
 */
public class WrapperDemo01 {

	public static void main(String[] args) {
		int a = 7;
		Integer a1= new Integer(7);//装箱
		int b=a1.intValue();//拆箱
		if(a==b){
			System.out.println("a等于b值");
		}

	}

}
