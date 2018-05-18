package javase.thread;

/**
 * 
*@Title:MyThread7
*@Description:加入延迟，线程实现不了资源共享，引起资源“抢占”为负数问题
*@author:Administrator
*@date:2017年9月12日 上午11:40:10
 */
class MyThread7 implements Runnable{
	private int ticket=5;
	public void run(){
		for(int i=0;i<50;i++){
		if(ticket>0){
			try {
				Thread.sleep(200);//加入延迟，线程实现不了资源共享，引起资源“抢占”为负数问题
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"票剩余:"+ticket--);
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
