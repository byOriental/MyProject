package javase.foundation;
/**
 * 
*@Title:DataTransform
*@Description:int��ȡֵ��ΧΪ��-2147483648~2147483647����ռ��4���ֽڣ�-2��31�η���2��31�η�-1��
*@author:Administrator
*@date:2017��8��13�� ����12:23:53
 */
//���������ʽ��Ctrl+i
public class DataTransform {
	public static void main(String args[]){
		float f=3f;
		int x=56;
		float y=3;
		int z=9;
		boolean flag=true;
		int max = Integer.MAX_VALUE;
		System.out.println("max�����ֵ:"+max);
		System.out.println("max+1:"+(max+1));
		System.out.println("max+2:"+(max+1));
		System.out.println("max+3:"+((long)max+3));//ǿ������ת��
		
		System.out.println("f*f="+(f*f));
		System.out.println("flag value is:"+flag);
		
		System.out.println("x/y:"+(x/y));//��������ת��ȥ��Χ��float
		System.out.println("y/z:"+((float)x/z));//��������ǿ��ת��
		

	}

}
