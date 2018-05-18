package javase.arrayMethod;

/**
 * 
*@Title:ArrayDemo02
*@Description:冒泡排序（Ctrl+/ 注释当前行 Ctrl+D删除当前行）
*@author:Administrator
*@date:2017年8月14日 上午11:42:40
 */
public class ArrayDemo02 {

	public static void main(String[] args) {
		int score[]={5,9,7,6,1,8,13,4};
		for(int i=1;i<score.length;i++){
			for(int j=0;j<score.length;j++){
				if(score[j]>score[i]){
					int temp; 
					temp=score[j];
					score[j]=score[i];
					score[i]=temp;  
				}
			}
			System.out.print("第"+i+"趟排序结果：");
			for(int j=0;j<score.length;j++){
				System.out.print(score[j]+"\t");
			}
			System.out.print("\n");//换行
//			System.out.println("");
		}

	}

}
