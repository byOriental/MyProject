package javase.foundation;

/**
 * 选择控制语句:if、if_else、switch
*@Title:IfElseSwitch
*@Description:
*@author:Administrator
*@date:2017年8月13日 下午10:52:34
 */
public class IfElseSwitch {
	public static void main(String args[]){
		int max=0;
		int a=6;
		int b=9;
		char x=98;
		char operator='*';

		//if(判断条件){语句}
		System.out.println("比较开始——————");
		if(a>b){
			System.out.println("a值大于b值");
		}
		if(b>a){
			System.out.println("b值大于a值");
		}
		System.out.println("比较结束——————");

		//if(判断条件){语句}else{}
		if(a%2==1){
			System.out.println("a是奇数");
		}else{
			System.out.println("a是偶数");
		}

		//三目运算符（可以替代if(判断条件){语句}else{}），通常将判断结果赋值给某个变量
		max=a>b ? a:b;
		System.out.println("最大值为："+max);

		//if(){}else if(){}***else{}
		if(x==8){
			System.out.println("x的值为8");
		}else if(x==9){
			System.out.println("x的值为9");
		}else if(x==98){
			System.out.println("x的值为98");
		}else{
			System.out.println("x的值既不是8也不是9更不是10而是："+x);
		}

		//switch
		switch(operator){
		case '+' : {
			System.out.println("a+b的值为："+(a+b));
			break;
		}
		case '-' : {
			System.out.println("a-b的值为："+(a-b));
			break;
		}
		case '*' : {
			System.out.println("a+b的值为："+(a*b));
			break;
		}
		default  :{
			System.out.println("非法符号操作@！！！");
			break;
		}
	  }
	} 
}
