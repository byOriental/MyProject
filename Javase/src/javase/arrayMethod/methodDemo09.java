package javase.arrayMethod;

/**
 * 
*@Title:methodDemo09
*@Description:java�����ԡ���foreach������������forѭ����
*@author:Administrator
*@date:2017��8��14�� ����3:07:22
 */
public class methodDemo09 {

	public static void main(String[] args) {
		fun(1,5,7);

	}
	public static void fun(int... arg){
		for(int i:arg){
			System.out.print(i+"��");
		}
	}

}
