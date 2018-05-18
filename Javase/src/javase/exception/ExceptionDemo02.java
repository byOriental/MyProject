package javase.exception;

/**
 * 
*@Title:ExceptionDemo02
*@Description:Throws关键字
*@author:Administrator
*@date:2017年9月9日 下午8:16:28
 */
class Match{
	public int div(int i,int j) throws Exception{
		int m;
		m=i/j;
		return m;
	}
}
public class ExceptionDemo02 {
	public static void main(String[] args) {
		Match mt=new Match();
		try {
			System.out.println("除法运算："+mt.div(8,2));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
