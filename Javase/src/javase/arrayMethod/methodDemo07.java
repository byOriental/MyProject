package javase.arrayMethod;

/**
 * 
*@Title:methodDemo07
*@Description:
*@author:Administrator
*@date:2017年8月14日 下午2:25:21
 */
public class methodDemo07 {

	public static void main(String[] args) {
		//定义两个数组，对其进行冒泡排序并输出
		int score[]={89,78,67,99,100,82};
		int age[]={32,27,26,33,17,20};
		
		sort(score);
		print(score);
		System.out.println("\n--------------------------------------");
		sort(age);
		print(age);

	}
        //冒泡排序
	private static void sort(int[] temp) {
		for(int i=1;i<temp.length;i++){	
			for(int j=0;j<temp.length;j++){
				if(temp[i]<temp[j]){
					int x=temp[j];
					temp[j]=temp[i];
					temp[i]=x;
				}
			}
		}
		
	}

	private static void print(int[] temp) {
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+"\t");
		}
		
		
	}
}
