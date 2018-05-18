package javase.arrayMethod;

/**
 * 
*@Title:methodDemo05
*@Description:递归调用；num+sum(num-1)
*@author:Administrator
*@date:2017年8月14日 下午1:51:17
 */
public class methodDemo05 {

	public static void main(String[] args) {
		System.out.println("计算机结果："+sum(100));

	}

	private static int sum(int num) {
		if(num==1){
			return 1;//结束条件，小疑问……
		}else{
			return num+sum(num-1);
		}
		
	}

}
