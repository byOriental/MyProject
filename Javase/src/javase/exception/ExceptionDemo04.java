package javase.exception;

class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
public class ExceptionDemo04 {

	public static void main(String[] args) {
		try {
			throw new MyException("�Զ�����쳣");
		} catch (MyException e) {
			System.out.println("�쳣��Ϣ��"+e);
		}

	}

}
