package javase.thread;

/**
 * 
*@Title:ThreadDemo03
*@Description:ʵ��Runable����ʵ����Դ����
*@author:Administrator
*@date:2017��9��10�� ����11:23:37
 */
class MyThread2 implements Runnable{
	private String name;
	private int ticket=5;
	public void run(){
		for(int i=0;i<10;i++){
			if(ticket>0){
				System.out.println("��Ʊ��ticket"+"="+ticket--);
			}
			
		}
		
	}
};
public class ThreadDemo03 {

	public static void main(String[] args) {
		MyThread2 m1=new MyThread2();
		new Thread(m1).start();
		new Thread(m1).start();
		new Thread(m1).start();
		new Thread(m1).start();
		new Thread(m1).start();

	}

}
