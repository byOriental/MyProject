package javase.thread;

/**
 * 
*@Title:MyThread7
*@Description:�����ӳ٣��߳�ʵ�ֲ�����Դ����������Դ����ռ��Ϊ��������
*@author:Administrator
*@date:2017��9��12�� ����11:40:10
 */
class MyThread7 implements Runnable{
	private int ticket=5;
	public void run(){
		for(int i=0;i<50;i++){
		if(ticket>0){
			try {
				Thread.sleep(200);//�����ӳ٣��߳�ʵ�ֲ�����Դ����������Դ����ռ��Ϊ��������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"Ʊʣ��:"+ticket--);
		}
	  }
   }
}
public class ThreadSyncDemo01 {
	public static void main(String[] args){
		MyThread7 mt = new MyThread7();
		Thread m1=new Thread(mt,"m1");
		Thread m2=new Thread(mt,"m2");
		Thread m3=new Thread(mt,"m3");
		Thread m4=new Thread(mt,"m4");
		m1.start();
		m2.start();
		m3.start();
		m4.start();
	}

}
