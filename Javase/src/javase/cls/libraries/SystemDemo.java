package javase.cls.libraries;

public class SystemDemo {

	public static void main(String[] args) {
		//����ѭ��������ʱ��
		Long st=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<1000000;i++){
			sum += i;
		}
		Long ed=System.currentTimeMillis();
		long rs=ed-st;
		System.out.println("ѭ������ʱ�䣺"+rs+"����");
		
		//�г�ϵͳ����
		System.out.println("ϵͳ���ƣ�"+System.getProperty("os.name"));
		System.out.println("�û����֣�"+System.getProperty("user.name"));
		System.out.println("�û�Ŀ¼��"+System.getProperty("user.dir"));
		System.out.println("ϵͳĿ¼��"+System.getProperty("os.home"));

	}

}
