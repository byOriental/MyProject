package javase.foundation;
/**
 * 
*@Title:DataTransform
*@Description:int的取值范围为（-2147483648~2147483647），占用4个字节（-2的31次方到2的31次方-1）
*@author:Administrator
*@date:2017年8月13日 上午12:23:53
 */
//调整代码格式：Ctrl+i
public class DataTransform {
	public static void main(String args[]){
		float f=3f;
		int x=56;
		float y=3;
		int z=9;
		boolean flag=true;
		int max = Integer.MAX_VALUE;
		System.out.println("max的最大值:"+max);
		System.out.println("max+1:"+(max+1));
		System.out.println("max+2:"+(max+1));
		System.out.println("max+3:"+((long)max+3));//强制类型转换
		
		System.out.println("f*f="+(f*f));
		System.out.println("flag value is:"+flag);
		
		System.out.println("x/y:"+(x/y));//数据类型转换去大范围的float
		System.out.println("y/z:"+((float)x/z));//数据类型强制转换
		

	}

}
