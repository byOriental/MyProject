package javase.foundation;

/**
 * 
*@Title:whileDoFor
*@Description:ѭ�����������ѭ���ж�
*@author:Administrator
*@date:2017��8��13�� ����10:54:00
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
		System.out.println("while_sum��ֵΪ��"+sum);
		
		//do{}while()
		do{
			sum1 += i1;
			i1++;
			
		}while(i1<=10);
		System.out.println("doWhile_sum��ֵΪ��"+sum1);
		
		//for
		for(i2 = 1; i2 <= 10; i2++){
			sum2 += i2;
		}
		System.out.println("for_sum��ֵΪ��"+sum2);
		
		//forѭ��Ƕ��_9*9�˷���
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print("x * y = "+(x*y)+"\t");
			}
			System.out.print("\n");
		}
		
		//breakѭ���жϣ�ȫ�жϣ�,���Ƕ��ѭ���ж�break���ϲ�
		for(int m=0;m<=10;m++){
			if(m==5){
				break;
			}
			System.out.println("m��ֵ��"+m);
		}
		
		//continueѭ���жϣ�ֻ�ж�һ�Σ�
		for(int n=0;n<=10;n++){
			if(n==3){
				 continue;
			}
			System.out.println("n��ֵ��"+n);
		}
	}

}
