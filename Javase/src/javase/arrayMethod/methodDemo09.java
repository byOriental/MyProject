package javase.arrayMethod;

/**
 * 
*@Title:methodDemo09
*@Description:java新特性——foreach输出（可以替代for循环）
*@author:Administrator
*@date:2017年8月14日 下午3:07:22
 */
public class methodDemo09 {

	public static void main(String[] args) {
		fun(1,5,7);

	}
	public static void fun(int... arg){
		for(int i:arg){
			System.out.print(i+"、");
		}
	}

}
