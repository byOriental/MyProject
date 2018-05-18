package javase.thread;
/**
 * 
*@Title:ThreadDemo02
*@Description:实现Runable的线程,任然通过Thread来启动线程,实现交替运行
*@author:Administrator
*@date:2017年9月10日 下午11:15:34
 */
class MyThread1 implements Runnable{
	private String name;
	
	public MyThread1(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0;i<4;i++){
			System.out.println("线程运行："+this.name+i);
		}
	}
}
public class ThreadDemo02 {

	public static void main(String[] args) {
		MyThread1 mt1=new MyThread1("张三");
		MyThread1 mt2=new MyThread1("李四");
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();

	}

}
