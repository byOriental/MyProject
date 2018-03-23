import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		AppService target = new AppServiceImpl();// ����Ŀ�����
		// �����������������
		System.getProperties().put(
				"sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		AppService proxy = (AppService) Proxy.newProxyInstance(target
				.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new LoggerInterceptor(target));
		proxy.createApp("Kevin Test");
	}
}