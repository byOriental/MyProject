package javase.foundation;

/**
 * ѡ��������:if��if_else��switch
*@Title:IfElseSwitch
*@Description:
*@author:Administrator
*@date:2017��8��13�� ����10:52:34
 */
public class IfElseSwitch {
	public static void main(String args[]){
		int max=0;
		int a=6;
		int b=9;
		char x=98;
		char operator='*';

		//if(�ж�����){���}
		System.out.println("�ȽϿ�ʼ������������");
		if(a>b){
			System.out.println("aֵ����bֵ");
		}
		if(b>a){
			System.out.println("bֵ����aֵ");
		}
		System.out.println("�ȽϽ���������������");

		//if(�ж�����){���}else{}
		if(a%2==1){
			System.out.println("a������");
		}else{
			System.out.println("a��ż��");
		}

		//��Ŀ��������������if(�ж�����){���}else{}����ͨ�����жϽ����ֵ��ĳ������
		max=a>b ? a:b;
		System.out.println("���ֵΪ��"+max);

		//if(){}else if(){}***else{}
		if(x==8){
			System.out.println("x��ֵΪ8");
		}else if(x==9){
			System.out.println("x��ֵΪ9");
		}else if(x==98){
			System.out.println("x��ֵΪ98");
		}else{
			System.out.println("x��ֵ�Ȳ���8Ҳ����9������10���ǣ�"+x);
		}

		//switch
		switch(operator){
		case '+' : {
			System.out.println("a+b��ֵΪ��"+(a+b));
			break;
		}
		case '-' : {
			System.out.println("a-b��ֵΪ��"+(a-b));
			break;
		}
		case '*' : {
			System.out.println("a+b��ֵΪ��"+(a*b));
			break;
		}
		default  :{
			System.out.println("�Ƿ����Ų���@������");
			break;
		}
	  }
	} 
}
