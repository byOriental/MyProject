package javase.exception;

/**
 * 
*@Title:ExceptionDemo03
*@Description:�Լ��׳����쳣
*@author:Administrator
*@date:2017��9��9�� ����9:34:17
 */
public class ExceptionDemo03 {

	public static void main(String[] args) {
		try {
			throw new Exception("�Լ��׳����쳣");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
