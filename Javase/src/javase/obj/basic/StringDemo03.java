package javase.obj.basic;

/**
 * 
*@Title:StringDemo03
*@Description:String�ĳ�������
*@author:Administrator
*@date:2017��9��13�� ����10:46:03
 */
public class StringDemo03 {

	public static void main(String[] args) {
		String str1="  hello word  !!!  ";
		String s1="baiyang";
		String s2="BAIYAnG";
		
		//ȡ��ָ��λ�õ��ַ�
		char c=str1.charAt(4);
		System.out.println("c:"+c);
		
		//�������
		byte b[]=str1.getBytes();
		String b1=new String(b);
		System.out.println("b1:"+b1);
		
		//ȡ�ַ����ĳ���
		int l=str1.length();
		System.out.println("l:"+l);
		
		//����ָ���ַ����Ƿ����
		int w=str1.indexOf("o");
		System.out.println("w:"+w);
		
		//ȥ���ո�
		String tr=str1.trim();
		System.out.println("str:"+tr);//ֻ��ȥ�����ҵĿո�
		
		//�ַ�����ȡ
		String sb=str1.substring(4, 7);
		System.out.println("sb:"+sb);
		
		//����ָ���ַ�������ַ���
		String s[]=str1.split(" ");
		System.out.println(s.length);//
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
			
		}
		
		//�ַ�����Сд��ĸת��
		String lc=str1.toLowerCase();
		String uc=str1.toUpperCase();
		System.out.println(lc);
		System.out.println(uc);
		
		//�����ִ�Сд���бȽϣ���ͬ����0������ͬ���ط���
		System.out.println("s1��s2�ıȽϣ�"+s1.compareToIgnoreCase(s2));
		
         	
	}

}
