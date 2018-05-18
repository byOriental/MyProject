package javase.arrayMethod;

/**
 * 
*@Title:MethodDemo02
*@Description:有参数调用与无参数调用
*@author:Administrator
*@date:2017年8月14日 下午1:18:47
 */
public class MethodDemo02 {

	public static void main(String[] args) {
		methodInfo1();
		int out=methodInfo2(89, 67);
		System.out.println(out);

	}

	private static int methodInfo2(int x,int y) {
		int sum;
		sum=x+y;
		return sum;
		
	}

	private static void methodInfo1() {
		System.out.println("计算两个数的值：");
		
	}

}
