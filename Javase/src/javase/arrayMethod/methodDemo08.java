package javase.arrayMethod;

/**
 * 
*@Title:methodDemo08
*@Description:java�����ԡ����ɱ�����Ĵ���
*@author:Administrator
*@date:2017��8��14�� ����2:55:05
 */
public class methodDemo08 {

	public static void main(String[] args) {
		System.out.print("�����ݲ�����");
		fun();
		System.out.print("\n����3��������");
		fun(1,5,7);
		System.out.print("\n����2������");
		fun(56,99);
		
			
		}
	public static void fun(int... arg){
		for(int i=0;i<arg.length;i++){
			System.out.print(arg[i]+"��");
			
		}
		

	}

}
