package javase.cls.libraries;

/**
 * 运行时操作类
 */

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Process pro = null;
		try {
			rt.exec("notepad.exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro.destroy();
		// TODO Auto-generated method stub

	}

}
