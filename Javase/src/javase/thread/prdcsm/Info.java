package javase.thread.prdcsm;

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
		System.out.println("���������ѣ�" + this.getName() + "-->"
				+ this.getContent());
		// --
		flag = true; // �޸ı�־λ
		super.notify();// ����
		// --
	}

}
