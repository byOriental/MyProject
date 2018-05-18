package javase.cls.libraries;

/**
 * 
*@Title:StringBufferDemo01
*@Description:StringBuffer类常用方法
*@author:Administrator
*@date:2017年9月12日 下午8:57:54
 */
public class StringBufferDemo01 {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer();
		buffer.append("hello");
		buffer.append("world");
		
		buffer.insert(6, "白杨，");//将字符串插入到buffer中，索引号为单个字符(char)
		System.out.println("buffer:"+buffer);
		
		String str = buffer.reverse().toString();
		System.out.println("反转字符串："+str);
		
		buffer.replace(3, 6, "666");
		System.out.println("替换后："+buffer);
		// TODO Auto-generated method stub

	}

}
