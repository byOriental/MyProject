package javase.thread;

/**
 * 
*@Title:MyThread4
*@Description:ʹ��sleep�������---����״̬
*@author:Administrator
*@date:2017��9��11�� ����1:01:24
 */
class MyThread4 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(10000);//10��ѭ��һ�Σ�1s=1000ms��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����--->"+i);
		}
	}
}
public class ThreadSleepDemo {

	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		Thread t = new Thread(mt,"�߳�1");
		t.start();
		// TODO Auto-generated method stub 

	}

}
