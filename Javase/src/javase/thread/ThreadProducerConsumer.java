package javase.thread;

class Info {
	private String name = "北京";
	private String content = "中国政治文化中心";

	private boolean flag = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// 生产者生产
	public synchronized void set(String name, String content) {
		// --
		if (!flag) {// 标志位为false,不可以生成
			try {
				super.wait();// 等待消费者取走
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// --
		this.setName(name);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
		// --唤醒--
		flag = false;
		super.notify();
		// --
	}

	// 消费者消费
	public synchronized void get() {
		// --
		if (flag) {// 标志位为true,不可以争取走
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "-->" + this.getContent());
		// --
		flag = true;
		super.notify();
		// --
	}

}

class Producer implements Runnable {
	private Info info = null;// 加入基类，练习子类的纽带

	public Producer(Info info) {
		this.info = info;
	}

	public void run() {
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if (flag) {
				this.info.set("北京", "中国政治文化中心");
				flag = false;
			} else {
				this.info.set("上海", "中国经济文化中心");
				flag = true;
			}

		}
	}
}

class Consumer implements Runnable {
	private Info info = null;

	public Consumer(Info info) {
		this.info = info;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.info.get();
		}

	}
}

public class ThreadProducerConsumer {

	public static void main(String[] args) {
		Info i = new Info();
		Producer pd = new Producer(i);
		Consumer cs = new Consumer(i);
		new Thread(pd).start();
		new Thread(cs).start();
		System.out.println("消费者");
	}

}
