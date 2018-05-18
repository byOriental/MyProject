package javase.thread;

/**
 * 
*@Title:MyThread9
*@Description:使用同步代码块（或同步方法）解决线程同步问题，实现资源共享，不再出现“卖票为负的问题”，过多的同步就会出现死锁
*@author:Administrator
*@date:2017年9月12日 下午12:13:32
 */
class MyThread9 implements Runnable{
	private int ticket=6;
	public void run(){
		for(int i=0;i<50;i++){
			//使用同步代码块
			synchronized (this) {
				if(ticket>0){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"票剩余："+ticket--);
				}
			}
//			this.sale();
		}
	}
	//使用同步方法
//	public synchronized void sale(){
//		if(ticket>0){
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+"票剩余："+ticket--);
//		}
//	}
}
public class ThreadSyncDemo02 {

	public static void main(String[] args) {
		MyThread9 mt = new MyThread9();
		Thread m1=new Thread(mt,"m1");
		Thread m2=new Thread(mt,"m2");
		Thread m3=new Thread(mt,"m3");
		Thread m4=new Thread(mt,"m4");
		Thread m5=new Thread(mt,"m5");
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		
		// TODO Auto-generated method stub

	}

}
