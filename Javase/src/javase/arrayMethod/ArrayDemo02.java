package javase.arrayMethod;

/**
 * 
*@Title:ArrayDemo02
*@Description:ð������Ctrl+/ ע�͵�ǰ�� Ctrl+Dɾ����ǰ�У�
*@author:Administrator
*@date:2017��8��14�� ����11:42:40
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
			System.out.print("��"+i+"����������");
			for(int j=0;j<score.length;j++){
				System.out.print(score[j]+"\t");
			}
			System.out.print("\n");//����
//			System.out.println("");
		}

	}

}
