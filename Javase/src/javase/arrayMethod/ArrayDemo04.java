package javase.arrayMethod;

/**
 * 
*@Title:ArrayDemo04
*@Description:��ά���龲̬����{{{ʵ������-һά}��ά}��ά}����ά�����{{ʵ������-һά}��ά}
*@author:Administrator
*@date:2017��8��14�� ����12:43:24
 */
public class ArrayDemo04 {

	public static void main(String[] args) {
		int score[][][]={{{231,67,34,88},{30,65,28,45},{90,56,0}}};
		
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				for(int k=0;k<score[i][j].length;k++){
					System.out.println("score["+i+"]["+j+"]["+k+"]="+score[i][j][k]);
				}
			}
		}

	}

}
