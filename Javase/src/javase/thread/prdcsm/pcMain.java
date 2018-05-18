package javase.thread.prdcsm;

public class pcMain {

	public static void main(String[] args) {
		Info i=new Info();
		Producer pd=new Producer(i);
		Consumer cs=new Consumer(i);
		new Thread(pd).start();
		new Thread(cs).start();
		// TODO Auto-generated method stub

	}

}
