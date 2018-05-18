package javase.thread;

/**
 * 
*@Title:MyThread
*@Description:继承Thread的线程谁抢到资源谁就运行
*@author:Administrator
*@date:2017年9月10日 下午11:12:04
 */
class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("线程运行："+this.name+i);
		}
	}
}
public class ThreadDemo01 {

	public static void main(String[] args) {
		MyThread mt1=new MyThread("张三");
		MyThread mt2=new MyThread("李四");
		mt1.start();
		mt2.start();

	}

}
