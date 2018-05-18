package javase.thread.prdcsm;

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
		System.out.println("消费者消费：" + this.getName() + "-->"
				+ this.getContent());
		// --
		flag = true; // 修改标志位
		super.notify();// 唤醒
		// --
	}

}
