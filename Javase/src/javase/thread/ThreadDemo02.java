package javase.thread;
/**
 * 
*@Title:ThreadDemo02
*@Description:ʵ��Runable���߳�,��Ȼͨ��Thread�������߳�,ʵ�ֽ�������
*@author:Administrator
*@date:2017��9��10�� ����11:15:34
 */
class MyThread1 implements Runnable{
	private String name;
	
	public MyThread1(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0;i<4;i++){
			System.out.println("�߳����У�"+this.name+i);
		}
	}
}
public class ThreadDemo02 {

	public static void main(String[] args) {
		MyThread1 mt1=new MyThread1("����");
		MyThread1 mt2=new MyThread1("����");
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();

	}

}
