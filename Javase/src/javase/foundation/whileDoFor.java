package javase.foundation;

/**
 * 
*@Title:whileDoFor
*@Description:循环控制语句与循环中断
*@author:Administrator
*@date:2017年8月13日 下午10:54:00
 */
public class whileDoFor {
	public static void main(String args[]){
		int i=1;
		int i1=1;
		int i2 = 1;
		int brk=9;
		int sum=0;
		int sum1=0;
		int sum2=0;
		
		
		//while{}
		while(i<=10){
			sum += i;
			i++;
		}
		System.out.println("while_sum的值为："+sum);
		
		//do{}while()
		do{
			sum1 += i1;
			i1++;
			
		}while(i1<=10);
		System.out.println("doWhile_sum的值为："+sum1);
		
		//for
		for(i2 = 1; i2 <= 10; i2++){
			sum2 += i2;
		}
		System.out.println("for_sum的值为："+sum2);
		
		//for循环嵌套_9*9乘法表
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print("x * y = "+(x*y)+"\t");
			}
			System.out.print("\n");
		}
		
		//break循环中断（全中断）,多层嵌套循环中断break到上层
		for(int m=0;m<=10;m++){
			if(m==5){
				break;
			}
			System.out.println("m的值："+m);
		}
		
		//continue循环中断（只中断一次）
		for(int n=0;n<=10;n++){
			if(n==3){
				 continue;
			}
			System.out.println("n的值："+n);
		}
	}

}
