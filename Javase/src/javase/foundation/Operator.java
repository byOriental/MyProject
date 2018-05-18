package javase.foundation;
/**
 * 
*@Title:Operator
*@Description:算术运算符、关系运算符、增减运算符、逻辑运算符、位运算符
*@author:Administrator
*@date:2017年8月12日 下午11:57:39
 */
public class Operator {

	public static void main(String[] args) {
		int x=2;
		int y=5;
		
		int m=3;//00000000 00000000 00000000 00000011
		int n=6;//00000000 00000000 00000000 00000110
		boolean a=true;
		boolean b=false;
		
		//关系运算符
		System.out.println("y/x:"+(y%x));//+、-、*算术运算符
		if((y-x)>0){//>、<、==关系运算符,返回值皆为true 或 false
			System.out.println("hello world!!!");
		}
		System.out.println("x<y:"+(x<y));
		
		//增减运算符
		System.out.println("x++="+(x++));//先赋值再运算
		System.out.println("++y="+(++y));//先运算再赋值
		
		//逻辑运算符
		System.out.println("a&&b="+(a&&b));//与运算，同真为真
		System.out.println("a||b="+(a||b));//或运算，同假为假
		
		//位运算符
		System.out.println("m&n="+(m&n));
		System.out.println("m|n="+(m|n));
		System.out.println("m^n="+(m^n));
		
		// TODO Auto-generated method stub

	}

}
