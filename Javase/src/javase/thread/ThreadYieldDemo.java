package javase.thread;

class MyThread6 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"����--->"+i);
			if(i==3){
				System.out.println("�߳��ò�---");
				Thread.yield();
			}
		}
	}
}

public class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThread6 mt = new MyThread6();
		Thread m1 = new Thread(mt,"�߳�Yeild1");
		Thread m2 = new Thread(mt,"�߳�Yeild2");
		m1.start();
		m2.start();

	}

}
