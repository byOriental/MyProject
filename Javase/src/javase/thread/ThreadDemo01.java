package javase.thread;

/**
 * 
*@Title:MyThread
*@Description:�̳�Thread���߳�˭������Դ˭������
*@author:Administrator
*@date:2017��9��10�� ����11:12:04
 */
class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("�߳����У�"+this.name+i);
		}
	}
}
public class ThreadDemo01 {

	public static void main(String[] args) {
		MyThread mt1=new MyThread("����");
		MyThread mt2=new MyThread("����");
		mt1.start();
		mt2.start();

	}

}
