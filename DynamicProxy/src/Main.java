import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		AppService target = new AppServiceImpl();// 生成目标对象
		// 接下来创建代理对象
		System.getProperties().put(
				"sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		AppService proxy = (AppService) Proxy.newProxyInstance(target
				.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new LoggerInterceptor(target));
		proxy.createApp("Kevin Test");
	}
}