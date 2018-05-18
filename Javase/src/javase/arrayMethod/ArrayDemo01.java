package javase.arrayMethod;

/**
 * 
*@Title:ArrayDemo01
*@Description:
*@author:Administrator
*@date:2017年8月13日 下午11:48:42
 */
public class ArrayDemo01 {

	public static void main(String[] args) {
		int score[]=new int[4];
		int array[]={12,332,423,5324,25,51,356};
		int max=0;
		int min=0;
		max=min=array[0];
		
		//动态初始化
		for(int i=0;i<=3;i++){
			score[i]=i*i;
			System.out.println("数组值得变化为："+score[i]);
		}
		
		//输出静态初始化的数组值
		for(int m=0;m<array.length;m++){
			System.out.println("array["+m+"]"+array[m]);
		}
		
		//数组比较max/min
		for(int x=0; x<array.length;x++){
			if(array[x]>max){
				max=array[x];
			}
			if(array[x]<min){
				min=array[x];
			}
		}
		System.out.println("max的值为："+max+"\n"+"min的值为："+min);
		
		// TODO Auto-generated method stub

	}

}
