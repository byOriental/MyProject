package javase.arrayMethod;

/**
 * 
*@Title:ArrayDemo03
*@Description:��ά����
*@author:Administrator
*@date:2017��8��14�� ����12:40:35
 */
public class ArrayDemo03 {

	public static void main(String[] args) {
		int score[][]=new int[4][5];
		score[0][2]=90;
		score[2][2]=80;
		score[1][2]=78;
		score[3][3]=90;
		score[2][4]=90;
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
		}
//		System.out.println(score.length);���ֵȡ�����еĳ���

	}

}
