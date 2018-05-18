package javase.thread;

class MyThread6 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"运行--->"+i);
			if(i==3){
				System.out.println("线程让步---");
				Thread.yield();
			}
		}
	}
}

public class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThread6 mt = new MyThread6();
		Thread m1 = new Thread(mt,"线程Yeild1");
		Thread m2 = new Thread(mt,"线程Yeild2");
		m1.start();
		m2.start();

	}

}
