package javase.exception;
/**
 * 
*@Title:ExceptionDemo01
*@Description:Throwable��Exception��Error�ĸ���,ErrorΪ������쳣�����ɲ�׽��,ExceptionΪ��������ʱ�쳣
*@author:Administrator
*@date:2017��9��9�� ����8:11:39
 */
public class ExceptionDemo01 {
	public static void main(String args[]){
		int i=8;
		int j=0;
		
		try {
			int m=i/j;
			System.out.println(m);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("�����쳣��:"+e);
		}	
	}

}
