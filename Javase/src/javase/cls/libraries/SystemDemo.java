package javase.cls.libraries;

public class SystemDemo {

	public static void main(String[] args) {
		//测试循环所消耗时间
		Long st=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<1000000;i++){
			sum += i;
		}
		Long ed=System.currentTimeMillis();
		long rs=ed-st;
		System.out.println("循环所用时间："+rs+"毫秒");
		
		//列出系统属性
		System.out.println("系统名称："+System.getProperty("os.name"));
		System.out.println("用户名字："+System.getProperty("user.name"));
		System.out.println("用户目录："+System.getProperty("user.dir"));
		System.out.println("系统目录："+System.getProperty("os.home"));

	}

}
