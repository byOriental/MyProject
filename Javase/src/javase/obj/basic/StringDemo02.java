package javase.obj.basic;

/**
 * 
*@Title:StringDemo02
*@Description:
*@author:Administrator
*@date:2017��8��15�� ����3:44:03
 */
public class StringDemo02 {

	public static void main(String[] args) {
		String s1="sunzhihui";
		byte[] c=s1.getBytes();
		String s2=c.toString();//ͨ����ͨ������Ϊ�ַ���
		String s3=new String(c);//ͨ�����췽����Ϊ�ַ���
		String s4=new String(c,0,5);//��ȡ�����ַ�
		System.out.println("s4:"+s4);
		System.out.println(s3);//ͬ�����
	}

}
