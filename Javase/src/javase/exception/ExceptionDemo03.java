package javase.exception;

/**
 * 
*@Title:ExceptionDemo03
*@Description:自己抛出的异常
*@author:Administrator
*@date:2017年9月9日 下午9:34:17
 */
public class ExceptionDemo03 {

	public static void main(String[] args) {
		try {
			throw new Exception("自己抛出的异常");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
