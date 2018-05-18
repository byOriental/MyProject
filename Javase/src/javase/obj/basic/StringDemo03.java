package javase.obj.basic;

/**
 * 
*@Title:StringDemo03
*@Description:String的常见操作
*@author:Administrator
*@date:2017年9月13日 上午10:46:03
 */
public class StringDemo03 {

	public static void main(String[] args) {
		String str1="  hello word  !!!  ";
		String s1="baiyang";
		String s2="BAIYAnG";
		
		//取定指定位置的字符
		char c=str1.charAt(4);
		System.out.println("c:"+c);
		
		//变成数组
		byte b[]=str1.getBytes();
		String b1=new String(b);
		System.out.println("b1:"+b1);
		
		//取字符串的长度
		int l=str1.length();
		System.out.println("l:"+l);
		
		//查找指定字符串是否存在
		int w=str1.indexOf("o");
		System.out.println("w:"+w);
		
		//去掉空格
		String tr=str1.trim();
		System.out.println("str:"+tr);//只能去掉左右的空格
		
		//字符串截取
		String sb=str1.substring(4, 7);
		System.out.println("sb:"+sb);
		
		//按照指定字符串拆分字符串
		String s[]=str1.split(" ");
		System.out.println(s.length);//
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
			
		}
		
		//字符串大小写字母转换
		String lc=str1.toLowerCase();
		String uc=str1.toUpperCase();
		System.out.println(lc);
		System.out.println(uc);
		
		//不区分大小写进行比较，相同返回0，不相同返回非零
		System.out.println("s1和s2的比较："+s1.compareToIgnoreCase(s2));
		
         	
	}

}
