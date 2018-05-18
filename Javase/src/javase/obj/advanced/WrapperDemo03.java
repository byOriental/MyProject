package javase.obj.advanced;


public class WrapperDemo03 {

	public static void main(String[] args) {
		String str1="9.99";
		String str2="99";
		float f=Float.parseFloat(str1);//字符串转换为Number类型
		int i=Integer.parseInt(str2);
		System.out.println("str1*str2="+f*i);

	}

}
