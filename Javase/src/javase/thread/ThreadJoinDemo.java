package javase.thread;
/**
 * 
*@Title:MyThread3
*@Description:使用join程序进入---运行状态
*@author:Administrator
*@date:2017年9月11日 上午1:02:46
 */
class MyThread3 implements Runnable{

	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+
					"运行"+"-->"+i);
		}
	}
	
}
public class ThreadJoinDemo {

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		Thread t = new Thread(mt,"线程");
		Thread t1 = new Thread(mt,"线程1");
		t.start();
		for(int i=0;i<20;i++){
			if(i>5){
				try {
					t.join(5000); 	//调用该方法，则t线程在运行，其他线程停止
				} catch (InterruptedException e) {
					e.printStackTrace();
				System.out.println("main线程运行-->"+i);
			}
		 }
	  }
   }
}
