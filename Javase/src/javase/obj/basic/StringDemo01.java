package javase.obj.basic;

/**
 * 
*@Title:StringDemo
*@Description:�����"=="����ַ����"equals"��ֵ���Ƚ�
*@author:Administrator
*@date:2017��8��15�� ����1:31:39
 */
public class StringDemo01 {

	public static void main(String[] args) {
		String str1="baiyang";
		String str2=new String("baiyang");
		String str3="baiyang";//�ٶ�����ֵͬʱ������������ý�ָ���Ѷ����ֵ�������ٿ��ٿռ�
		System.out.println("str1=str2:"+(str1==str2));//��ַ�Ƚ�
		System.out.println("str1=str2:"+str1.equals(str2));//��ֵַ�Ƚ�
		System.out.println("str1=str3:"+(str1==str3));//�������
		// TODO Auto-generated method stub

	}

}
