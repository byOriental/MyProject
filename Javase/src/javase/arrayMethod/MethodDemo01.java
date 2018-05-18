package javase.arrayMethod;

/**
 * 
*@Title:MethodDemo01
*@Description:无返回参数
*@author:Administrator
*@date:2017年8月14日 下午12:59:43
 */
public class MethodDemo01 {

	public static void main(String[] args) {
		methodInfo1();
		methodInfo2();
		System.out.println("hello baiyangandsunzhihui,welcome!");
		
		// TODO Auto-generated method stub

	}

	private static void methodInfo2() {
		char c1[]={'b','a','i','y','a','n','g'};
		for(int i=0;i<c1.length;i++){
			System.out.print(c1[i]);
		}
		System.out.println("");
		
	}

	private static void methodInfo1() {
		char c2[]={'s','u','n','z','h','i','h','u','i'};
		for(int j=0;j<c2.length;j++){
			System.out.print(c2[j]);
		}
		System.out.println("");
		
	}

}
