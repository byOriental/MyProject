package javase.thread;

class zhangsan{
	public void say(){
		System.out.println("����"+":"+"��ҪƯ�������ã�");
	}
	public void get(){
		System.out.println("����"+":"+"�Ѿ��õ�Ư�������ã�");
	}
}
class lisi{
	public void say(){
		System.out.println("����"+":"+"��Ҫmoney��");
	}
	public void get(){
		System.out.println("����"+":"+"�Ѿ��õ�money��");
	}
}
class MyThread10 implements Runnable{
	private static zhangsan zs=new zhangsan();
	private static lisi ls=new lisi();
	boolean flag=false;
	
	public void run(){
		if(flag){
			synchronized (zs) {//��ʱzsִ�У�����������
				zs.say();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (ls) {//ͬ������������ʱ��������ȴ�
					zs.get();
				}
			}
		}
		else{
			synchronized (ls) {//��ʱzsִ�У�����������
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
		//��Ϊ�����������̣߳����� ��ʱ�������߳��ڲ���
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}
