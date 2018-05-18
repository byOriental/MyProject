package javase.obj.basic;

/**
 * 
*@Title:StringDemo02
*@Description:
*@author:Administrator
*@date:2017年8月15日 下午3:44:03
 */
public class StringDemo02 {

	public static void main(String[] args) {
		String s1="sunzhihui";
		byte[] c=s1.getBytes();
		String s2=c.toString();//通过普通方法变为字符串
		String s3=new String(c);//通过构造方法变为字符串
		String s4=new String(c,0,5);//截取部分字符
		System.out.println("s4:"+s4);
		System.out.println(s3);//同样输出
	}

}
