package javase.thread;

class zhangsan{
	public void say(){
		System.out.println("张三"+":"+"我要漂亮的妹妹！");
	}
	public void get(){
		System.out.println("张三"+":"+"已经得到漂亮的妹妹！");
	}
}
class lisi{
	public void say(){
		System.out.println("李四"+":"+"我要money！");
	}
	public void get(){
		System.out.println("李四"+":"+"已经得到money！");
	}
}
class MyThread10 implements Runnable{
	private static zhangsan zs=new zhangsan();
	private static lisi ls=new lisi();
	boolean flag=false;
	
	public void run(){
		if(flag){
			synchronized (zs) {//此时zs执行，其他进不来
				zs.say();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (ls) {//同步李四在运行时，张三则等待
					zs.get();
				}
			}
		}
		else{
			synchronized (ls) {//此时zs执行，其他进不来
				ls.say();
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (zs) {
					ls.get();
				}
			}
		}
	}
}
public class ThreadSyncDemo03 {

	public static void main(String[] args) { 
		MyThread10 mt1 = new MyThread10();
		MyThread10 mt2 = new MyThread10();
		mt1.flag=true;
		mt2.flag=false;
		
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		//因为在启动两个线程，所以 此时有两个线程在操作
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}
