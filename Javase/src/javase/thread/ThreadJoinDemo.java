package javase.thread;
/**
 * 
*@Title:MyThread3
*@Description:ʹ��join�������---����״̬
*@author:Administrator
*@date:2017��9��11�� ����1:02:46
 */
class MyThread3 implements Runnable{

	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+
					"����"+"-->"+i);
		}
	}
	
}
public class ThreadJoinDemo {

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		Thread t = new Thread(mt,"�߳�");
		Thread t1 = new Thread(mt,"�߳�1");
		t.start();
		for(int i=0;i<20;i++){
			if(i>5){
				try {
					t.join(5000); 	//���ø÷�������t�߳������У������߳�ֹͣ
				} catch (InterruptedException e) {
					e.printStackTrace();
				System.out.println("main�߳�����-->"+i);
			}
		 }
	  }
   }
}
