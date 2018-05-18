package javase.thread;

class Info {
	private String name = "����";
	private String content = "�й������Ļ�����";

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

	// ����������
	public synchronized void set(String name, String content) {
		// --
		if (!flag) {// ��־λΪfalse,����������
			try {
				super.wait();// �ȴ�������ȡ��
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
		// --����--
		flag = false;
		super.notify();
		// --
	}

	// ����������
	public synchronized void get() {
		// --
		if (flag) {// ��־λΪtrue,��������ȡ��
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
	private Info info = null;// ������࣬��ϰ�����Ŧ��

	public Producer(Info info) {
		this.info = info;
	}

	public void run() {
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if (flag) {
				this.info.set("����", "�й������Ļ�����");
				flag = false;
			} else {
				this.info.set("�Ϻ�", "�й������Ļ�����");
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
		System.out.println("������");
	}

}
