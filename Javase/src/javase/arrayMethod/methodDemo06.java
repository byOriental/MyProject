package javase.arrayMethod;

/**
 * 
*@Title:methodDemo06
*@Description:�������ô��ݣ�������������޸ļ�����������
*@author:Administrator
*@date:2017��8��14�� ����2:16:59
 */
public class methodDemo06 {

	public static void main(String[] args) {
		int arry[]={8,5,8,4,3};
		for(int j = 0;j<arry.length;j++){
			System.out.print(arry[j]+"��");
		}
		System.out.println("");
		fun(arry);
		for(int i=0;i<arry.length;i++){
			System.out.print(arry[i]+"��");
		}

	}

	private static void fun(int[] arry) {
		arry[2]=2000;
	}

}
