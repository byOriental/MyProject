package javase.thread;

/**
 * 
*@Title:MyThread5
*@Description:ʹ��interrupt�������---��������״̬
*@author:Administrator
*@date:2017��9��11�� ����1:23:45
 */
class MyThread5 implements Runnable{
	public void run(){
		try {
			Thread.sleep(10000);//����10��
		} catch (InterruptedException e) {
			System.out.println("���߱���ֹ");
		}
		System.out.println("���߽Y��");
	}
}
public class ThreadInterruptDemo {


	public static void main(String[] args) {
		MyThread5 mt = new MyThread5();
		Thread t = new Thread(mt);
		t.start();
		try {
			Thread.sleep(2000);//����2�뱻��ֹ
		} catch (InterruptedException e) {
			
		}
		t.interrupt();
		System.out.println("������������������");

	}

}
