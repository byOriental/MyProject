package javase.arrayMethod;

/**
 * 
*@Title:methodDemo05
*@Description:�ݹ���ã�num+sum(num-1)
*@author:Administrator
*@date:2017��8��14�� ����1:51:17
 */
public class methodDemo05 {

	public static void main(String[] args) {
		System.out.println("����������"+sum(100));

	}

	private static int sum(int num) {
		if(num==1){
			return 1;//����������С���ʡ���
		}else{
			return num+sum(num-1);
		}
		
	}

}
