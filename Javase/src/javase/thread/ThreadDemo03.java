package javase.thread;

/**
 * 
*@Title:ThreadDemo03
*@Description:实现Runable可以实现资源共享
*@author:Administrator
*@date:2017年9月10日 下午11:23:37
 */
class MyThread2 implements Runnable{
	private String name;
	private int ticket=5;
	public void run(){
		for(int i=0;i<10;i++){
			if(ticket>0){
				System.out.println("卖票：ticket"+"="+ticket--);
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
