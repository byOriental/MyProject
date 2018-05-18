package javase.thread;

/**
 * 
*@Title:MyThread5
*@Description:使用interrupt程序进入---进入运行状态
*@author:Administrator
*@date:2017年9月11日 上午1:23:45
 */
class MyThread5 implements Runnable{
	public void run(){
		try {
			Thread.sleep(10000);//休眠10秒
		} catch (InterruptedException e) {
			System.out.println("休眠被终止");
		}
		System.out.println("休眠結束");
	}
}
public class ThreadInterruptDemo {


	public static void main(String[] args) {
		MyThread5 mt = new MyThread5();
		Thread t = new Thread(mt);
		t.start();
		try {
			Thread.sleep(2000);//休眠2秒被终止
		} catch (InterruptedException e) {
			
		}
		t.interrupt();
		System.out.println("主方法——————");

	}

}
