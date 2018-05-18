package javase.arrayMethod;

/**
 * 
*@Title:ArrayDemo04
*@Description:三维数组静态定义{{{实体数据-一维}二维}三维}，二维亦如此{{实体数据-一维}二维}
*@author:Administrator
*@date:2017年8月14日 下午12:43:24
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
