package javase.obj.basic;

/**
 * 
*@Title:StringDemo
*@Description:对象的"=="（地址）与"equals"（值）比较
*@author:Administrator
*@date:2017年8月15日 下午1:31:39
 */
public class StringDemo01 {

	public static void main(String[] args) {
		String str1="baiyang";
		String str2=new String("baiyang");
		String str3="baiyang";//再定义相同值时，所定义的引用将指向已定义的值，不会再开辟空间
		System.out.println("str1=str2:"+(str1==str2));//地址比较
		System.out.println("str1=str2:"+str1.equals(str2));//地址值比较
		System.out.println("str1=str3:"+(str1==str3));//对象共享池
		// TODO Auto-generated method stub

	}

}
