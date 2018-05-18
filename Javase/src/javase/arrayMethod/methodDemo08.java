package javase.arrayMethod;

/**
 * 
*@Title:methodDemo08
*@Description:java新特性——可变参数的传递
*@author:Administrator
*@date:2017年8月14日 下午2:55:05
 */
public class methodDemo08 {

	public static void main(String[] args) {
		System.out.print("不传递参数：");
		fun();
		System.out.print("\n传递3个参数：");
		fun(1,5,7);
		System.out.print("\n传递2参数：");
		fun(56,99);
		
			
		}
	public static void fun(int... arg){
		for(int i=0;i<arg.length;i++){
			System.out.print(arg[i]+"、");
			
		}
		

	}

}
