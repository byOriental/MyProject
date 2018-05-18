package javase.exception;

class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
public class ExceptionDemo04 {

	public static void main(String[] args) {
		try {
			throw new MyException("自定义的异常");
		} catch (MyException e) {
			System.out.println("异常信息："+e);
		}

	}

}
