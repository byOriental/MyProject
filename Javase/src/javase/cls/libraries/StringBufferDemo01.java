package javase.cls.libraries;

/**
 * 
*@Title:StringBufferDemo01
*@Description:StringBuffer�ೣ�÷���
*@author:Administrator
*@date:2017��9��12�� ����8:57:54
 */
public class StringBufferDemo01 {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer();
		buffer.append("hello");
		buffer.append("world");
		
		buffer.insert(6, "���");//���ַ������뵽buffer�У�������Ϊ�����ַ�(char)
		System.out.println("buffer:"+buffer);
		
		String str = buffer.reverse().toString();
		System.out.println("��ת�ַ�����"+str);
		
		buffer.replace(3, 6, "666");
		System.out.println("�滻��"+buffer);
		// TODO Auto-generated method stub

	}

}
