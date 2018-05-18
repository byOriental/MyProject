package javase.thread;

/**
 * 
*@Title:MyThread4
*@Description:使用sleep程序进入---堵塞状态
*@author:Administrator
*@date:2017年9月11日 上午1:01:24
 */
class MyThread4 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(10000);//10秒循环一次（1s=1000ms）
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"运行--->"+i);
		}
	}
}
public class ThreadSleepDemo {

	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		Thread t = new Thread(mt,"线程1");
		t.start();
		// TODO Auto-generated method stub 

	}

}
