package javase.arrayMethod;

/**
 * 
*@Title:methodDemo03
*@Description:��������-��������ͬ���������������Ͳ�ͬ
*@author:Administrator
*@date:2017��8��14�� ����1:22:05
 */
public class methodDemo03 {

	public static void main(String[] args) {
		int one=add(89,87);
		int two=add(124,98,555);
		float three=add(89f,543f);
		System.out.println("the one:"+one);
		System.out.println("the three:"+three);
		System.out.println("the two:"+two);

	}

	private static float add(float f, float g) {
		float temp;
		temp=f+g;
		return temp;
	}

	private static int add(int i, int j, int k) {
		int temp;
		temp=i+j+k;
		return temp;
	}

	private static int add(int i, int j) {
		int temp;
		temp=i+j;
		return temp;
	}

}
