package javase.arrayMethod;

/**
 * 
*@Title:ArrayDemo01
*@Description:
*@author:Administrator
*@date:2017��8��13�� ����11:48:42
 */
public class ArrayDemo01 {

	public static void main(String[] args) {
		int score[]=new int[4];
		int array[]={12,332,423,5324,25,51,356};
		int max=0;
		int min=0;
		max=min=array[0];
		
		//��̬��ʼ��
		for(int i=0;i<=3;i++){
			score[i]=i*i;
			System.out.println("����ֵ�ñ仯Ϊ��"+score[i]);
		}
		
		//�����̬��ʼ��������ֵ
		for(int m=0;m<array.length;m++){
			System.out.println("array["+m+"]"+array[m]);
		}
		
		//����Ƚ�max/min
		for(int x=0; x<array.length;x++){
			if(array[x]>max){
				max=array[x];
			}
			if(array[x]<min){
				min=array[x];
			}
		}
		System.out.println("max��ֵΪ��"+max+"\n"+"min��ֵΪ��"+min);
		
		// TODO Auto-generated method stub

	}

}
